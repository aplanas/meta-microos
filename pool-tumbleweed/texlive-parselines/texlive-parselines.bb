SUMMARY = "Apply a macro to each line of an environment"
DESCRIPTION = "The package defines an environment 'parse lines' which \
processes each line of an environment with a macro. An example \
of shading the lines of an environment is given."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn21475"

RPM_NAME = "texlive-parselines-2023.209.1.4svn21475-52.1.noarch.rpm"
RPM_HASH = "dccd7a5826172f62afad57b7b810f77f85bf5e76b7cdb85f5d5cc16b5be8f9d885fe93b26701ae0e8e2082c9806814cb7b330c862b3dedddbb3ee719c586d458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parselines.sty \
texlive-parselines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

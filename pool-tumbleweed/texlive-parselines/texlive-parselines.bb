SUMMARY = "Apply a macro to each line of an environment"
DESCRIPTION = "The package defines an environment 'parse lines' which \
processes each line of an environment with a macro. An example \
of shading the lines of an environment is given."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn21475"

RPM_NAME = "texlive-parselines-2023.201.1.4svn21475-51.1.noarch.rpm"
RPM_HASH = "e52d722afeb0f5d8024117b04d32b1b6ecf502de61cb596fa86529270cfe4a4fc21d48ccf0f646fe95f2ddd63e3ddd2b602bd6e748e248a4b2e7829322fc8946"
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

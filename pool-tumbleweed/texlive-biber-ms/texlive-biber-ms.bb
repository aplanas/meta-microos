SUMMARY = "A BibTeX replacement for users of BibLaTeX (multiscript version)"
DESCRIPTION = "This is the multiscript version of biber (biber-ms) and must be \
used with the multiscript version of biblatex-ms"
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2023.209.4.0_1svn66478"

RPM_NAME = "texlive-biber-ms-2023.209.4.0_1svn66478-54.1.noarch.rpm"
RPM_HASH = "935392614113ded4d5373ccc9f71be738a69f9992700d31a2928a4e91c431afde85387db76698a9de1f365c78b45688fa375ff10ede2561fb830dc480413c9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-biber-ms-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

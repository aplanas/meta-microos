SUMMARY = "Logos for The Hague University of Applied Sciences (THUAS)"
DESCRIPTION = "This package contains some logos of The Hague University of \
Applied Sciences (THUAS). These Logos are available in English \
and in Dutch. They are rendered via PGF."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn51347"

RPM_NAME = "texlive-thuaslogos-2023.209.1.2svn51347-55.1.noarch.rpm"
RPM_HASH = "7d775f0837aa69fb30bea5cbbaf4eb8a8fbe11dc7a4a133a04e5c402f73234bfc47586d314b73c73ed9aaf23df2fc3640a73103d74151eb61f8b0bf0f7afd073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thuaslogos.sty \
texlive-thuaslogos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

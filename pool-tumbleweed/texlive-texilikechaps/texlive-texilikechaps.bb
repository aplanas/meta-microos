SUMMARY = "Format chapters with a texi-like format"
DESCRIPTION = "The package enables the user to reduce the size of the rather \
large chapter headings in standard classes into a texi-like \
smaller format. Details of the format may be controlled with \
internal commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn28553"

RPM_NAME = "texlive-texilikechaps-2023.209.1.0asvn28553-55.1.noarch.rpm"
RPM_HASH = "d2c2fb404b86fe09d6bd3dcdcba9e71f961a9d2c1ac473aaa2cafa1b79272a8c3fbb89e280d24f4304a5204896db47bd33ef4410c883557c63375c2dd400b914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texilikechaps.sty \
texlive-texilikechaps"

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

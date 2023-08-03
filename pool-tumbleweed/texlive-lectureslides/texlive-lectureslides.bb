SUMMARY = "Combine single PDF files into one file"
DESCRIPTION = "This package makes it easy to combine and index individual PDF \
files into one large PDF file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62292"

RPM_NAME = "texlive-lectureslides-2023.209.1.0svn62292-55.1.noarch.rpm"
RPM_HASH = "8fdce15aaab4fe67d0b9fd7018f7ff0f48c2832a685399f489c0f70858ef126cd1d6fb664d20c32aeff509fc143036e2507d61acf5408128e7b3923ff13c1070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lectureslides.sty \
texlive-lectureslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

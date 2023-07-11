SUMMARY = "Report font features in XeTeX"
DESCRIPTION = "A pair of documents to reveal the font features supported by \
fonts usable in XeTeX. Use OpenType-info.tex for OpenType \
fonts, and AAT-info.tex for AAT fonts (Mac OS X only)."
LICENSE = "Apache-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-xetexfontinfo-2023.201.svn15878-52.2.noarch.rpm"
RPM_HASH = "23cc241a9cba45cbbfd97acc07cf1cda3328ffb51ec15aff42b52c1b00c699175f9776102f2510159c4608f3a2c68e425fbe2d2a7c41dd19fcd8e8c3b7ca4fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aat-info.tex \
tex-opentype-info.tex \
texlive-xetexfontinfo"

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

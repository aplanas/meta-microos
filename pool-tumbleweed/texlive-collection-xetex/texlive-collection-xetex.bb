SUMMARY = "XeTeX and packages"
DESCRIPTION = "Packages for XeTeX, the Unicode/OpenType-enabled TeX by \
Jonathan Kew, http://tug.org/xetex."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn64951"

RPM_NAME = "texlive-collection-xetex-2023.208.svn64951-58.1.noarch.rpm"
RPM_HASH = "41e54ead55b9fc7a8446278a70615d30791f4e64cf90452bbf82beeb2a42257bd0b06d8814971f1553b02eb36694e467177ca324ecf2164b54360cce394f984f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xetex \
texlive-collection-xetex"

RDEPENDS:${PN} += "texlive-arabxetex \
texlive-awesomebox \
texlive-bidi-atbegshi \
texlive-bidicontour \
texlive-bidipagegrid \
texlive-bidipresentation \
texlive-bidishadowtext \
texlive-businesscard-qrcode \
texlive-collection-basic \
texlive-cqubeamer \
texlive-fixlatvian \
texlive-font-change-xetex \
texlive-fontbook \
texlive-fontwrap \
texlive-interchar \
texlive-na-position \
texlive-philokalia \
texlive-ptext \
texlive-realscripts \
texlive-simple-resume-cv \
texlive-simple-thesis-dissertation \
texlive-tetragonos \
texlive-ucharclasses \
texlive-unicode-bidi \
texlive-unimath-plain-xetex \
texlive-unisugar \
texlive-xebaposter \
texlive-xechangebar \
texlive-xecolor \
texlive-xecyr \
texlive-xeindex \
texlive-xelatex-dev \
texlive-xesearch \
texlive-xespotcolor \
texlive-xetex \
texlive-xetex-itrans \
texlive-xetex-pstricks \
texlive-xetex-tibetan \
texlive-xetexconfig \
texlive-xetexfontinfo \
texlive-xetexko \
texlive-xevlna \
texlive-zbmath-review-template"

inherit rpm

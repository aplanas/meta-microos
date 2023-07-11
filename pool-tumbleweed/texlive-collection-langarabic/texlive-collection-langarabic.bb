SUMMARY = "Arabic"
DESCRIPTION = "Support for Arabic and Persian."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59594"

RPM_NAME = "texlive-collection-langarabic-2023.208.svn59594-60.1.noarch.rpm"
RPM_HASH = "fc346df0edc570ea10d9bfbe2cee77c8ceea7fad6102e3881e6ed72998e217c128c4225af095c12343bf44349fe497b7ef487e8538b50e3d16608a3d245b98b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langarabic"

RDEPENDS:${PN} += "texlive-alkalami \
texlive-alpha-persian \
texlive-amiri \
texlive-arabi \
texlive-arabi-add \
texlive-arabic-book \
texlive-arabluatex \
texlive-arabtex \
texlive-bidi \
texlive-bidihl \
texlive-collection-basic \
texlive-dad \
texlive-ghab \
texlive-hvarabic \
texlive-hyphen-arabic \
texlive-hyphen-farsi \
texlive-imsproc \
texlive-kurdishlipsum \
texlive-lshort-persian \
texlive-luabidi \
texlive-na-box \
texlive-persian-bib \
texlive-quran \
texlive-sexam \
texlive-simurgh \
texlive-texnegar \
texlive-tram \
texlive-xepersian \
texlive-xepersian-hm"

inherit rpm

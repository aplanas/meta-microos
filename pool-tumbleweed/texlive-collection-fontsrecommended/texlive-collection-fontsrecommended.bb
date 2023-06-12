SUMMARY = "Recommended fonts"
DESCRIPTION = "Recommended fonts, including the base 35 PostScript fonts, \
Latin Modern, TeX Gyre, and T1 and other encoding support for \
Computer Modern, in outline form."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-fontsrecommended-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "679804bd50dea107a149e6c068acd0ac918793b255bece22f8532cd1c8e35bcc7c191a3cebad42181512e6378574343e933d568308a5bc8fc7f35e0abb2b314a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-fontsrecommended"
RDEPENDS:${PN} += "texlive-avantgar \
texlive-bookman \
texlive-charter \
texlive-cm-super \
texlive-cmextra \
texlive-collection-basic \
texlive-courier \
texlive-euro \
texlive-euro-ce \
texlive-eurosym \
texlive-fpl \
texlive-helvetic \
texlive-lm \
texlive-lm-math \
texlive-manfnt-font \
texlive-marvosym \
texlive-mathpazo \
texlive-mflogo-font \
texlive-ncntrsbk \
texlive-palatino \
texlive-pxfonts \
texlive-rsfs \
texlive-symbol \
texlive-tex-gyre \
texlive-tex-gyre-math \
texlive-times \
texlive-tipa \
texlive-txfonts \
texlive-utopia \
texlive-wasy \
texlive-wasy-type1 \
texlive-wasysym \
texlive-zapfchan \
texlive-zapfding"

inherit rpm

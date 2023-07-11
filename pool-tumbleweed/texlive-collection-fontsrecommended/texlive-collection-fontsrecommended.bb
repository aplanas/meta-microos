SUMMARY = "Recommended fonts"
DESCRIPTION = "Recommended fonts, including the base 35 PostScript fonts, \
Latin Modern, TeX Gyre, and T1 and other encoding support for \
Computer Modern, in outline form."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-fontsrecommended-2023.208.svn54074-60.1.noarch.rpm"
RPM_HASH = "2a50b84671ad64925850c6acdea6a9a2bad914ae3ef14b8fd09365ca1746321c3268cf8fd62360a43b7b55b96ad0bfcad1216b7a6bbb61d5fb712474f59186cd"
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

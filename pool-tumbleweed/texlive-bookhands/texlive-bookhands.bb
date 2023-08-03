SUMMARY = "A collection of book-hand fonts"
DESCRIPTION = "This is a set of book-hand (Metafont) fonts and packages \
covering manuscript scripts from the 1st century until \
Gutenberg and Caxton. The included hands are: Square Capitals \
(1st century onwards); Roman Rustic (1st-6th centuries); \
Insular Minuscule (6th cenury onwards); Carolingian Minuscule \
(8th-12th centuries); Early Gothic (11th-12th centuries); \
Gothic Textura Quadrata (13th-15th centuries); Gothic Textura \
Prescisus vel sine pedibus (13th century onwards); Rotunda \
(13-15th centuries); Humanist Minuscule (14th century onwards); \
Uncial (3rd-6th centuries); Half Uncial (3rd-9th centuries); \
Artificial Uncial (6th-10th centuries); and Insular Majuscule \
(6th-9th centuries)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46480"

RPM_NAME = "texlive-bookhands-2023.209.svn46480-53.1.noarch.rpm"
RPM_HASH = "9c85bff7845d9085012f57453b0db497b44a40ae50d22ae95081b30a12d570b12d4b9637b17a9dcb0e564f1b4a9a3731055a4d1f8363ece2895932bf70142b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-allcmin.sty \
tex-allegoth.sty \
tex-allhmin.sty \
tex-allhuncl.sty \
tex-allimaj.sty \
tex-allimin.sty \
tex-allpgoth.sty \
tex-allrtnd.sty \
tex-allrust.sty \
tex-allsqrc.sty \
tex-alltgoth.sty \
tex-alluncl.sty \
tex-auncl17.tfm \
tex-auncl7.tfm \
tex-aunclb17.tfm \
tex-aunclb7.tfm \
tex-carolmin.sty \
tex-cmin10.tfm \
tex-cmin17.tfm \
tex-cmin7.tfm \
tex-cminb10.tfm \
tex-cminb17.tfm \
tex-cminb7.tfm \
tex-egoth10.tfm \
tex-egoth17.tfm \
tex-egoth7.tfm \
tex-egothb10.tfm \
tex-egothb17.tfm \
tex-egothb7.tfm \
tex-egothic.sty \
tex-hmin10.tfm \
tex-hmin17.tfm \
tex-hmin7.tfm \
tex-hminb10.tfm \
tex-hminb17.tfm \
tex-hminb7.tfm \
tex-humanist.sty \
tex-huncial.sty \
tex-huncl10.tfm \
tex-huncl17.tfm \
tex-huncl7.tfm \
tex-hunclb10.tfm \
tex-hunclb17.tfm \
tex-hunclb7.tfm \
tex-imaj10.tfm \
tex-imaj17.tfm \
tex-imaj7.tfm \
tex-imajb10.tfm \
tex-imajb17.tfm \
tex-imajb7.tfm \
tex-imin10.tfm \
tex-imin17.tfm \
tex-imin7.tfm \
tex-iminb10.tfm \
tex-iminb17.tfm \
tex-iminb7.tfm \
tex-inslrmaj.sty \
tex-inslrmin.sty \
tex-ot1auncl.fd \
tex-ot1cmin.fd \
tex-ot1egoth.fd \
tex-ot1hmin.fd \
tex-ot1huncl.fd \
tex-ot1imaj.fd \
tex-ot1imin.fd \
tex-ot1pgoth.fd \
tex-ot1rtnd.fd \
tex-ot1rust.fd \
tex-ot1sqrc.fd \
tex-ot1tgoth.fd \
tex-ot1uncl.fd \
tex-pgoth10.tfm \
tex-pgoth17.tfm \
tex-pgoth7.tfm \
tex-pgothb10.tfm \
tex-pgothb17.tfm \
tex-pgothic.sty \
tex-rotunda.sty \
tex-rtnd10.tfm \
tex-rtnd17.tfm \
tex-rtnd7.tfm \
tex-rtndb10.tfm \
tex-rtndb17.tfm \
tex-rtndb7.tfm \
tex-rust10.tfm \
tex-rust17.tfm \
tex-rust7.tfm \
tex-rustb10.tfm \
tex-rustb17.tfm \
tex-rustb7.tfm \
tex-rustic.sty \
tex-sqrc10.tfm \
tex-sqrcaps.map \
tex-sqrcaps.sty \
tex-sqrcb10.tfm \
tex-t1auncl.fd \
tex-t1cmin.fd \
tex-t1egoth.fd \
tex-t1hmin.fd \
tex-t1huncl.fd \
tex-t1imaj.fd \
tex-t1imin.fd \
tex-t1pgoth.fd \
tex-t1rtnd.fd \
tex-t1rust.fd \
tex-t1sqrc.fd \
tex-t1tgoth.fd \
tex-t1uncl.fd \
tex-tgothb10.tfm \
tex-tgothb17.tfm \
tex-tgothic.sty \
tex-tgothr10.tfm \
tex-tgothr17.tfm \
tex-tgothr7.tfm \
tex-uncial.sty \
tex-uncl10.tfm \
tex-uncl17.tfm \
tex-uncl7.tfm \
tex-unclb10.tfm \
tex-unclb17.tfm \
tex-unclb7.tfm \
texlive-bookhands"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-bookhands-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

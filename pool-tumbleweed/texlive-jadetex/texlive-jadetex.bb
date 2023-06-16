SUMMARY = "Macros supporting Jade DSSSL output"
DESCRIPTION = "Macro package on top of LaTeX to typeset TeX output of the Jade \
DSSSL implementation."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13svn63654"

RPM_NAME = "texlive-jadetex-2023.201.3.13svn63654-55.1.noarch.rpm"
RPM_HASH = "30f97034c7838cbc1a9cd3ed74bb8b6894f515d8fecfd84a94dafa33ded0a305b8bfc8ace17df6fd604338554a3c6467bbb492c466491a0770cba8fa4f5a5b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dsssl.def \
tex-uentities.sty \
tex-ut1omlgc.fd \
texlive-jadetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-amsfonts \
texlive-atbegshi \
texlive-atveryend \
texlive-auxhook \
texlive-babel \
texlive-bigintcalc \
texlive-bitset \
texlive-cm \
texlive-colortbl \
texlive-courier \
texlive-cyrillic \
texlive-dehyph \
texlive-ec \
texlive-etexcmds \
texlive-everyshi \
texlive-fancyhdr \
texlive-filesystem \
texlive-firstaid \
texlive-gettitlestring \
texlive-graphics \
texlive-graphics-cfg \
texlive-graphics-def \
texlive-helvetic \
texlive-hycolor \
texlive-hyperref \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-iftex \
texlive-infwarerr \
texlive-intcalc \
texlive-jadetex-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvdefinekeys \
texlive-kvoptions \
texlive-kvsetkeys \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-fonts \
texlive-latexconfig \
texlive-letltxmacro \
texlive-ltxcmds \
texlive-marvosym \
texlive-passivetex \
texlive-pdfescape \
texlive-pdftex \
texlive-pdftexcmds \
texlive-psnfss \
texlive-refcount \
texlive-rerunfilecheck \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd \
texlive-symbol \
texlive-tex \
texlive-tex-ini-files \
texlive-times \
texlive-tipa \
texlive-tools \
texlive-ulem \
texlive-unicode-data \
texlive-uniquecounter \
texlive-url \
texlive-wasysym \
texlive-zapfding"

inherit rpm

SUMMARY = "German 'school scripts' from Suetterlin to the present day"
DESCRIPTION = "Das Paket enthalt im wesentlichen die Metafont-Quellfiles fur \
die folgenden Schulausgangsschriften: Suetterlinschrift, \
Deutsche Normalschrift, Lateinische Ausgangsschrift, \
Schulausgangsschrift, Vereinfachte Ausgangsschrift. Damit ist \
es moglich, beliebige deutsche Texte in diesen Schreibschriften \
zu schreiben."
LICENSE = "LPPL-1.0"

PV = "2023.209.5svn59388"

RPM_NAME = "texlive-schulschriften-2023.209.5svn59388-54.1.noarch.rpm"
RPM_HASH = "16b23f493cbdb6507cef7103d723644ab6964ff5ac5f20883bbeb917291214c048654c3c13fef484bf261244dd085a93aa4d45d7b1f3dbebf02a9d224be8ef47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schulschriften-lin.sty \
tex-schulschriften-ltx.sty \
tex-t1wedn.fd \
tex-t1wela.fd \
tex-t1wesa.fd \
tex-t1wesu.fd \
tex-t1weva.fd \
tex-wedn.sty \
tex-wedn14.tfm \
tex-wednbx14.tfm \
tex-wednbxsl14.tfm \
tex-wedneb14.tfm \
tex-wednebsl14.tfm \
tex-wednsb14.tfm \
tex-wednsbsl14.tfm \
tex-wednsl14.tfm \
tex-wednub14.tfm \
tex-wednubsl14.tfm \
tex-wela.sty \
tex-wela14.tfm \
tex-welabx14.tfm \
tex-welabxsl14.tfm \
tex-welaeb14.tfm \
tex-welaebsl14.tfm \
tex-welasb14.tfm \
tex-welasbsl14.tfm \
tex-welasl14.tfm \
tex-welaub14.tfm \
tex-welaubsl14.tfm \
tex-wesa.sty \
tex-wesa14.tfm \
tex-wesabx14.tfm \
tex-wesabxsl14.tfm \
tex-wesaeb14.tfm \
tex-wesaebsl14.tfm \
tex-wesasb14.tfm \
tex-wesasbsl14.tfm \
tex-wesasl14.tfm \
tex-wesaub14.tfm \
tex-wesaubsl14.tfm \
tex-wesu.sty \
tex-wesu14.tfm \
tex-wesub14.tfm \
tex-wesubsl14.tfm \
tex-wesubx14.tfm \
tex-wesubxsl14.tfm \
tex-wesueb14.tfm \
tex-wesuebsl14.tfm \
tex-wesusb14.tfm \
tex-wesusbsl14.tfm \
tex-wesusl14.tfm \
tex-wesuub14.tfm \
tex-wesuubsl14.tfm \
tex-weva.sty \
tex-weva14.tfm \
tex-wevabx14.tfm \
tex-wevabxsl14.tfm \
tex-wevaeb14.tfm \
tex-wevaebsl14.tfm \
tex-wevasb14.tfm \
tex-wevasbsl14.tfm \
tex-wevasl14.tfm \
tex-wevaub14.tfm \
tex-wevaubsl14.tfm \
texlive-schulschriften"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-eepic.sty \
tex-ifthen.sty \
tex-latexsym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

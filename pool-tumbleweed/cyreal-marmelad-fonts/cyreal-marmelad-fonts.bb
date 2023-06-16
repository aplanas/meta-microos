SUMMARY = "Marmelad Cyrillic Font"
DESCRIPTION = "Marmelad is designed specifically for medium to large-size headlines and \
remains well-balanced for long text setting because of its regular \
proportions and medium contrast. Ascenders and descenders are elegant \
and details refined. The name and overall feel refers to marmalade \
sweets – soft and ductile. \
 \
All vertical strokes are rounded towards the baseline, which is why \
technically there is no sense for overshoots in rounded letters like O. \
Marmelad performs well on screen because of its soft rounded features \
and generous x-height. \
 \
The font supports Latin-1, Cyrillic and Turkish (Latin-5) encoding."
LICENSE = "OFL-1.1"

PV = "1.000"

RPM_NAME = "cyreal-marmelad-fonts-1.000-7.17.noarch.rpm"
RPM_HASH = "2b20136d7fcc7558c86a6f1fc4ff6f6b9d30a53f48f9075eadea3e4b919e97d212e54dc29dd5b71c8275e3fd4c5c9cf3a1b7b2e91557fc2c8357ecde11bb0343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-marmelad-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm

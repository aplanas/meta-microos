SUMMARY = "Simple Icons for LaTeX"
DESCRIPTION = "Similar to FontAwesome icons being provided on LaTeX by the \
fontawesome package, this package aims to do the same with \
Simple Icons. For reference, visit their website: \
https://simpleicons.org/."
LICENSE = "LPPL-1.0"

PV = "2023.201.8.6.0svn66328"

RPM_NAME = "texlive-simpleicons-2023.201.8.6.0svn66328-53.1.noarch.rpm"
RPM_HASH = "84ef2918a3710be5ff66c51b936a7c11da2ef8834b7125b2d8553592ca91de6b4a0c23e5da4e6613e5fadfe4201d7b11e81a1248ae8d57aaf211321de8dca493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(SimpleIcons--simpleiconsEight.tfm) \
tex(SimpleIcons--simpleiconsFive.tfm) \
tex(SimpleIcons--simpleiconsFour.tfm) \
tex(SimpleIcons--simpleiconsNine.tfm) \
tex(SimpleIcons--simpleiconsOne.tfm) \
tex(SimpleIcons--simpleiconsOneZero.tfm) \
tex(SimpleIcons--simpleiconsSeven.tfm) \
tex(SimpleIcons--simpleiconsSix.tfm) \
tex(SimpleIcons--simpleiconsThree.tfm) \
tex(SimpleIcons--simpleiconsTwo.tfm) \
tex(simpleicons.map) \
tex(simpleicons.sty) \
tex(simpleiconsEight.enc) \
tex(simpleiconsFive.enc) \
tex(simpleiconsFour.enc) \
tex(simpleiconsNine.enc) \
tex(simpleiconsOne.enc) \
tex(simpleiconsOneZero.enc) \
tex(simpleiconsSeven.enc) \
tex(simpleiconsSix.enc) \
tex(simpleiconsThree.enc) \
tex(simpleiconsTwo.enc) \
tex(simpleiconsglyphs-pdftex.tex) \
tex(simpleiconsglyphs-xeluatex.tex) \
tex(usimpleiconsEight.fd) \
tex(usimpleiconsFive.fd) \
tex(usimpleiconsFour.fd) \
tex(usimpleiconsNine.fd) \
tex(usimpleiconsOne.fd) \
tex(usimpleiconsOneZero.fd) \
tex(usimpleiconsSeven.fd) \
tex(usimpleiconsSix.fd) \
tex(usimpleiconsThree.fd) \
tex(usimpleiconsTwo.fd) \
texlive-simpleicons"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-simpleicons-fonts"

inherit rpm

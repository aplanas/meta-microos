SUMMARY = "Concrete Math fonts"
DESCRIPTION = "A LaTeX package and font definition files to access the \
Concrete mathematics fonts, which were derived from Computer \
Modern math fonts using parameters from Concrete Roman text \
fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17219"

RPM_NAME = "texlive-concmath-2023.201.svn17219-53.1.noarch.rpm"
RPM_HASH = "ab9ca499270d36a8a63e6de6bdd453f159f700737074d1ce02bffeac5e56168bf756f9405c54f1059093c7a7fd700ad2702878f9d5043b36bdff75fa338c0a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-concmath.sty \
tex-omlccm.fd \
tex-omlccr.fd \
tex-omsccr.fd \
tex-omsccsy.fd \
tex-omxccex.fd \
tex-ot1ccr.fd \
tex-ucca.fd \
tex-uccb.fd \
texlive-concmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-exscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

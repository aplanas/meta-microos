SUMMARY = "Improved quantifier stroke for Begriffsschrift packages"
DESCRIPTION = "The font contains a single character: the Begriffsschrift \
quantifier (in several sizes), as used to set the \
Begriffsschrift (concept notation) of Frege. The font is not \
intended for end users; instead it is expected that it will be \
used by other packages which implement the Begriffsschrift. An \
(unofficial) modified version of Josh Parsons' begriff is \
included as an example of implementation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn27401"

RPM_NAME = "texlive-bguq-2023.209.0.0.4svn27401-54.1.noarch.rpm"
RPM_HASH = "d2d87b3a9a373c92f0e89357fe4b2cba63f03eadfeff730d4c654dd4b024e90f32cdb851ae6cb4f3477b2361fc5b79fa6d8916a535b30abc7d59d583bf914683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ubguq04.fd \
tex-Ubguq05.fd \
tex-Ubguq06.fd \
tex-Ubguq07.fd \
tex-Ubguq08.fd \
tex-Ubguq09.fd \
tex-Ubguq10.fd \
tex-Ubguq11.fd \
tex-Ubguq12.fd \
tex-begriff-bguq.sty \
tex-bguq.cfg \
tex-bguq.map \
tex-bguq.sty \
tex-bguq10t04.tfm \
tex-bguq10t05.tfm \
tex-bguq10t06.tfm \
tex-bguq10t07.tfm \
tex-bguq10t08.tfm \
tex-bguq10t09.tfm \
tex-bguq10t10.tfm \
tex-bguq10t11.tfm \
tex-bguq10t12.tfm \
texlive-bguq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-updmap.cfg \
texlive \
texlive-bguq-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

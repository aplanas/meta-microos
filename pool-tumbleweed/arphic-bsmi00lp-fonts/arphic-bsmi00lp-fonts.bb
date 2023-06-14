SUMMARY = "AR PL Mingti2L Big5 Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL Mingti2L Big5 is a high quality Chinese TrueType font \
(bsmi00lp.ttf) generously provided by Arphic Technology to the Free \
Software community under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-bsmi00lp-fonts-20001125-778.2.noarch.rpm"
RPM_HASH = "739494c205a099a3107be7548f5dc5d34e3bb876da731d1a679bba0e5ac0fdc778e653aafd3e9c404024ad1a2d731138b91c8852610bae408bd9611376eda666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-bsmi00lp-fonts \
config-arphic-bsmi00lp-fonts \
ttf-arphic-bsmi00lp"

RDEPENDS:${PN} += "/bin/sh \
arphic-fonts"

inherit rpm

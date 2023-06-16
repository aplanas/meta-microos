SUMMARY = "AR PL KaitiM Big5 Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL KaitiM Big5 is a high quality Chinese TrueType font \
(bkai00mp.ttf) generously provided by Arphic Technology to the Free \
Software community under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-bkai00mp-fonts-20001125-778.2.noarch.rpm"
RPM_HASH = "0a46306acda30bdfd9eaa457ad1b929820805395f0e645b0ce14e257f41bcb6787cac2fac30c99c81e54feed01668734b9c5db84038440b46b7baeed2e4db500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-bkai00mp-fonts \
config-arphic-bkai00mp-fonts \
ttf-arphic-bkai00mp"

RDEPENDS:${PN} += "/usr/bin/sh \
arphic-fonts"

inherit rpm

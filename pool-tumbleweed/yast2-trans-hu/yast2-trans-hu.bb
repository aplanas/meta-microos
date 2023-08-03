SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-hu-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "e5a5f7dbf83ed55740dc7d8dc94644b24730f68d419ae5d42bdbaeea459f50b11c80802b941aab4a07181ba76902173b0bc2dc662a24f87cbeb2fb4e13cf039c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hu \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm

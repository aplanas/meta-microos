SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ne-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "bda9c1ba3ff3c4b85bfbd8ab93a94ce5d7ca734c8ef810829b0166a43cf84a15db88fe0436182a2b12d64498fc44346f41a0736ff8565283a46e94420bed9fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm

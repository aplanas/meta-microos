SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-sw-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "436fb7825b38e7f74d0f19fbbd48fbac9312d5fa9c5fdf956ec25c9d9ce0608b04f65b9e2dc271449ed2763140086ab66063e6957feeb557e009d0170167329a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sw \
yast2-trans-sw"

RDEPENDS:${PN} += ""

inherit rpm

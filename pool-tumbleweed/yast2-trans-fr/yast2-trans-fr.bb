SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-fr-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "40536a6881efac47efd8258860e2a0d9823ac3e92e44f32f190adb12a3a20ff1ae3047f2a5f959662ce03dabb1e8cd9131b174ff7395d51a78d85b955df745ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fr \
yast2-trans-fr"

RDEPENDS:${PN} += ""

inherit rpm

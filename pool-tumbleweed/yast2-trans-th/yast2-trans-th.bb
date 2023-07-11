SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-th-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "e09755386f305d66d9500278c2e980efed2dcadfbaaae1297d85d9c3afca651ae272eeb1e36cad6540c4a01ef56a06886d115a8da00459631955498d133d8340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm

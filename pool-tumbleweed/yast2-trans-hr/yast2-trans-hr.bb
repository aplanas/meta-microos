SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-hr-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "89d0041743330010dd7ef6d7b88c7e44c240c0addaa2c515224b52d37bc571a83f3a17ff6226da000c25704dce9368de9dd09783af9230cbc65deec9996f51d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hr \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm

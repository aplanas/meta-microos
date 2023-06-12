SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-xh-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "c3a84cae5fb1001810adce8ff84a57a862d7bcddda2d3be7413399cd8563d24def085ad82ee6dcbeca8d9e95ac5c81390708a6efc1413afd9a74e9e5723318a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:xh) \
yast2-trans-xh"
RDEPENDS:${PN} += ""

inherit rpm

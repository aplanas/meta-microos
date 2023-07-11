SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-bs-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "28254b4dddf5e2941cda3bc96ec161b9ebc794ae6d3080c1a2df48ad5757d5c15a133a667ca0677af45f88e84d37f34dccec4b241f16eb5c9accb326232919fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bs \
yast2-trans-bs"

RDEPENDS:${PN} += ""

inherit rpm

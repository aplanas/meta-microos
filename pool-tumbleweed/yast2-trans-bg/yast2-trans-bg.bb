SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-bg-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "288d9bddf1159e01dcdc9c9518d3309e5319afd1a6915029e81cc2ff6c9f4f6d66d07a676e924ea68de9ccb0569d189340cd024dfea992df760cdf3a0b552e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bg \
yast2-trans-bg"

RDEPENDS:${PN} += ""

inherit rpm

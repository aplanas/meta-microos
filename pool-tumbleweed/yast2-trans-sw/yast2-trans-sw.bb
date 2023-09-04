SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-sw-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "0fd5f9b566f1a9bd2101415f9be8e34651f7bf7961995af50fedb06e94905c2fb50930f94de3b2617c59eb048307ac532ab467fdb30e44bdff36482d28d88cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sw \
yast2-trans-sw"

RDEPENDS:${PN} += ""

inherit rpm

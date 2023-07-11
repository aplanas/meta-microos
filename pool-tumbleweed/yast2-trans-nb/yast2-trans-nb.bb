SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-nb-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "2e90ce6e9a1f60590b08a3cc2129f895a50a3e10145e168b5a06bc5c5f5bcf29a17ad0f51fa6bc64a51835eef67ec5c5a2ab80e43444a0cdff8e1031025d8449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nb \
yast2-trans-nb"

RDEPENDS:${PN} += ""

inherit rpm

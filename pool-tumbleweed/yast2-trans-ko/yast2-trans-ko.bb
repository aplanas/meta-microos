SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ko-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "8e5360c8f57c2588b508060f9179e3309266d8d706273d18cc500ee9e0e0f6db02a5c9cb178696a47133c1861956373eba5bf5eb411accd7aadeaa5a5f1785db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ko \
yast2-trans-ko"

RDEPENDS:${PN} += ""

inherit rpm

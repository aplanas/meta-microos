SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-sw-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "951fadd52dac1de9648968b1eeed7f6316436d21415698c845abe5216df8a687b996b78a32c708be8e235a784a3a66524fd2ee3a793597793178639d9342f149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sw \
yast2-trans-sw"

RDEPENDS:${PN} += ""

inherit rpm

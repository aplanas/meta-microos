SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-sw-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "7c5c00c34f2b7138c1e500ea1e86635fa5f7903219cc31231a2402946efec2fe868aab16ef3a2e086311917ac40a9df8a2e2adb1674d430bd5054c73c82e9919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sw \
yast2-trans-sw"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-sw-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "2851b6ae0a07f2935d648228566dcae863d0e82b96066bf857185ca33b81eb10b8152585d40efc3eb0e156674635d7314681e4040d51ccd00dc68dc87b389f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sw) \
yast2-trans-sw"
RDEPENDS:${PN} += ""

inherit rpm

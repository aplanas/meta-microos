SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-zu-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "95c74cc2050eeeb3db3bbcba835e0d755a2ebf4ca27cc4ecaf989455316c2b5e7abc35a6e730ed01c481ca7be643df8db7ca10f80f8540eefe06a062c57995d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:zu) \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm

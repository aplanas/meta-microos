SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-jv-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "4ca6abe330cd161cdd2c3ec46b134b1038ba4f5d3096b090af02cdf4790336974b65dbeb850efd4a2e47e54355be271102c7d854a3eb77d08694a19bed65c8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:jv) \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm

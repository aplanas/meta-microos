SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-es-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "fd61bddbe5a626d81b8e050718f9e09a95c0631c219319cb3de631d898453cc3eea90217676f603d9e04411518b3e1aacb42dd1de58b0476c3a13ba672e97d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm

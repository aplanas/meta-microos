SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ja-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "abb0e5008c43488a62c7ebb6a18c953185d6df2be772d2a46098907d749355e91e1570f31577c61938e54b1a9d3e35f18212e5180c6fbdb94c3446d0300ba6d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ja) \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm

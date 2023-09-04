SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-th-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "6d945e62aade3303b25aa9730c1114334b0e05b40c2191ea7c129e42dc3b258263353679b6547d01848e78a06905a25f2c71a54f03b001b7202a64ec0df17a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm

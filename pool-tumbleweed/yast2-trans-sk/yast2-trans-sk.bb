SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-sk-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "8b8b130b5a824e95feb82e3e1eed76cc936e6dfd1b5082e53401a8117dc5f15f1387606f121d9e97e67fb86330934f5c0713ef255ee788dacd4fa094f2697c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sk \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm

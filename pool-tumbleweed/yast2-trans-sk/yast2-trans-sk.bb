SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-sk-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "51c983218c240d9e37cdd3d1a40b43e9bf6bbc7faba91d8d95a5b2affd7d27f87c811abffa9696ce1ac0a46a9d3f7cde2860d0c1759f0a4aeadcdebdb6fc2595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sk) \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm

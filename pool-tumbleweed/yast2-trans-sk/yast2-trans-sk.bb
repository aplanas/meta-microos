SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-sk-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "fc512061c9298ebd63ebf1d9b790550264d12fa69dd82cf4d678b1b4b9e53d906035551b79c8e825b33404f3ef784d54796aa5b225bd47227287c3b0692e8139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sk \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm

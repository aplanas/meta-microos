SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-gl-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "7aeb3fb7bd75f0c91cf519c801bdb6b310372123e0f3a084dbf0d3182b22162b6475c0e091a69851da8f85ea3810166c877361307532ea3ebe7f80d6a93e70f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gl \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-mr-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "0d46b85c60ad132f097db72b1c48ed31f2c01667c3978e1c0722f1f6b090a8dc51c87502ae2feca1870574c86cc4b3cf7ae982a79c0460b9dfae826c59a3aa9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mr \
yast2-trans-mr"

RDEPENDS:${PN} += ""

inherit rpm

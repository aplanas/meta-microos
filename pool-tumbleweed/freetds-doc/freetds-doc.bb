SUMMARY = "User documentation for FreeTDS"
DESCRIPTION = "The freetds-doc package contains the useguide and reference of FreeTDS \
and can be installed even if FreeTDS main package is not installed"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "freetds-doc-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "eff3b7217792c2c1916087a8a5c7969dac331516106b6d4a5212353c1ac2d6ee21540ab7e2acde6de4a7528820e73515ea8d0d48dfe17947698004c529d9749a"

RPROVIDES:${PN} += "freetds-doc \
freetds-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

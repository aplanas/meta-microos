SUMMARY = "Data files for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides data/configuration files for libenchant."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-data-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "bcdb1b1b1e45e55a57216e93219e930c643e4497106c89b54c9718ea3d7d551a3e91be8979840e207c98004663bf30e41d84bfd0a769961dd0642f333dac920d"

RPROVIDES:${PN} += "enchant-1-data \
enchant-1-data(aarch-64) \
enchant-data \
libenchant1:/usr/share/enchant/enchant.ordering"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "attica-qt5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0e9657d152fb062170b244656d3b592788dd5fcc15a7d674fa7f232665850efe69091305f4063aecc37ad74b5e0c8b6b1f0f6fac78225eea3f2e0e3cc239e53d"

RPROVIDES:${PN} += "attica-qt5"

RDEPENDS:${PN} += ""

inherit rpm

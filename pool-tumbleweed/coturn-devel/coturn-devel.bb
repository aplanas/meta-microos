SUMMARY = "Coturn development headers"
DESCRIPTION = "This package contains the TURN development headers."
LICENSE = "BSD-3-Clause"

PV = "4.6.2"

RPM_NAME = "coturn-devel-4.6.2-1.3.aarch64.rpm"
RPM_HASH = "7af621da27c67bb1686d921c0555c650b2d073ca65f1483e2f0b15b5f2c4c8568140e9141bce399fcd0e9448fed08e61c62f367da050bdb68ecc8bf22cead46e"

RPROVIDES:${PN} += "coturn-devel"

RDEPENDS:${PN} += "coturn"

inherit rpm

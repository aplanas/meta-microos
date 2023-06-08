SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "49543eb4289dea2c48ffa9aafb1143e1824faea6cf49855492e9892ed0dbfd20305f6c10dd0b87f839c5ac50872608afce1ed5223054b5c50fe9e0f04e48be70"

RPROVIDES:${PN} += "cross-i386-gcc7-icecream-backend cross-i386-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

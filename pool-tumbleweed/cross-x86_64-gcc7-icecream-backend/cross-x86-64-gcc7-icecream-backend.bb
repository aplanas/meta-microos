SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "4c2c0a260c6ddd048a5334e50903de625b26567b2fd297b40e3f2ac0c525a6062e7259cccd2a9de41d9ac6d0b1e45ac5f1cec42925fd888a4cf12c1ac1992ce1"

RPROVIDES:${PN} += "cross-x86_64-gcc7-icecream-backend \
cross-x86_64-gcc7-icecream-backend(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

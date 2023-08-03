SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libmount-devel-static-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "9a3be7a000e510ac96c0a02918a98ea4525f7cd240349b38ac47e217b5e7f11858c497689444e57328ac4e41415b65fad1f5a6df668c589d9f773fcf5fa4990a"

RPROVIDES:${PN} += "libmount-devel-static"

RDEPENDS:${PN} += "libmount-devel"

inherit rpm

SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-arm-none-newlib-devel-4.3.0.20230120-2.2.aarch64.rpm"
RPM_HASH = "9e26eaf187b4ca18329faa9dda7e6d194ac4999ce0e5d4bd78cde6cb1b6b2895304443197d53d8f51d616f55b56bf5edb94db1489d91083cfd54f51b7c08f6bb"

RPROVIDES:${PN} += "cross-arm-none-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm

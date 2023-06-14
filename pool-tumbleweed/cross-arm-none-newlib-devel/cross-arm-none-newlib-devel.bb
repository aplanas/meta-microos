SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-arm-none-newlib-devel-4.3.0.20230120-2.1.aarch64.rpm"
RPM_HASH = "030b58ca48df497e8dfa0cebe873014308ddb61e7dfaf3b1afb580ce8ebbb18200e9cb9761672dfa1f213b5c67ae67df550acae3d52066cd8b7e7f785e408ff2"

RPROVIDES:${PN} += "cross-arm-none-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm

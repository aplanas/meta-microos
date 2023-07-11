SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-epiphany-newlib-devel-4.3.0.20230120-2.2.aarch64.rpm"
RPM_HASH = "33658eb0a6d240dfe1256803f4eb837853d56026a00fab85f34a855de90506724e4c1bc138289257171d4e38de1b5c62a699c3789f823bf5353a1989061052c5"

RPROVIDES:${PN} += "cross-epiphany-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm

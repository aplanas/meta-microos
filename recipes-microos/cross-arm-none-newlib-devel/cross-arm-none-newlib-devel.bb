SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-arm-none-newlib-devel-4.3.0.20230120-1.3.aarch64.rpm"
RPM_HASH = "7b67b2377721d734dcf49ccdcf970de1010dfbc0e3b3fa309b70a5a7444c9eb0fa7692674ba06e68290482bda91533ffe3609110db911614a34a5f92295bf72d"

RPROVIDES:${PN} += "cross-arm-none-newlib-devel cross-arm-none-newlib-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

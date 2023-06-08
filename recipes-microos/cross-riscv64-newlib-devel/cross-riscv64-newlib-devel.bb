SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-riscv64-newlib-devel-4.3.0.20230120-1.3.aarch64.rpm"
RPM_HASH = "5dff7ff8f47ff11d2f50bb21de0f30a9f9dab1ffddddc9926c0229ccf110cbf0f3017364d9e5edba1fcd2ce524ac5aeeb33e49f94ab13d7f2044fa55521edde1"

RPROVIDES:${PN} += "cross-riscv64-newlib-devel cross-riscv64-newlib-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

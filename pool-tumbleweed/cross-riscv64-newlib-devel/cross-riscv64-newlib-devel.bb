SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-riscv64-newlib-devel-4.3.0.20230120-2.1.aarch64.rpm"
RPM_HASH = "21cb6235823a8ac7c80c77afc084faecba4e1a2e84a8ffc25fd1384cd767e99806d837a1c5a250bfa07a3b8e6011079af5589eada7035695ba19d6e8b6a3eec9"

RPROVIDES:${PN} += "cross-riscv64-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm

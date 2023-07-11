SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-riscv64-newlib-devel-4.3.0.20230120-2.2.aarch64.rpm"
RPM_HASH = "ad85ac7be006785df3ff7729f6b79507b2ed8accf8ad239af054a4014e1f815788944a97bccf7fe212eff92e0b90037462b6fe2d061e6db333d056e3d1d3136f"

RPROVIDES:${PN} += "cross-riscv64-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm

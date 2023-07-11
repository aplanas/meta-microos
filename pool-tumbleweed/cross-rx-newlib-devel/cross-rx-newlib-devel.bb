SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-rx-newlib-devel-4.3.0.20230120-2.2.aarch64.rpm"
RPM_HASH = "2144c8fff54874d14c405db32e7b4e0c171a68c1d2e33a58d0f7392e87a46aeb6fdc7181b126920a94cd13fc0920b62b4c39d6e5ae5a3ac706ba5da3d87b1e14"

RPROVIDES:${PN} += "cross-rx-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm

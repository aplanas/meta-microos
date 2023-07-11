SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-pru-newlib-devel-4.3.0.20230120-2.2.aarch64.rpm"
RPM_HASH = "88ffa0668e0c3b830b8d25175701e6c2c379b46667fecb87a810be4bf372974f287fc739a23bc12219382a89589e98afa7505c3bf5c2d8b91498a9ad841896ca"

RPROVIDES:${PN} += "cross-pru-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm

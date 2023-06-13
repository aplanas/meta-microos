SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-rx-newlib-devel-4.3.0.20230120-2.1.aarch64.rpm"
RPM_HASH = "e27dc6d401247341c7f7ff28d071cfc1fcfa783be598f8e99967ed14646de1877e7bc776c4d85607e298582b79ad5a5f21eb8231d38487da6731f0fe29c5cfe9"

RPROVIDES:${PN} += "cross-rx-newlib-devel \
cross-rx-newlib-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

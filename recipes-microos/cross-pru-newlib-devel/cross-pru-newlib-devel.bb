SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-pru-newlib-devel-4.3.0.20230120-1.3.aarch64.rpm"
RPM_HASH = "e9329c6cd4ccc093c47a26850995410a9c0060d7f085ae0aec3a030f26d7ede8f742ac723cad10a46e39d047b7431169120da1f5555eab2831ce2829f9297c40"

RPROVIDES:${PN} += "cross-pru-newlib-devel cross-pru-newlib-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

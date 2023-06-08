SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-epiphany-newlib-devel-4.3.0.20230120-1.3.aarch64.rpm"
RPM_HASH = "aac14de3410144d342e2cd66e5f053f1200d5fe93bf477e578c8e1d6113e29c75f2ff1ec8f949076c0a242d2374e1201a7d06210e72a818ed19c06ade9e89926"

RPROVIDES:${PN} += "cross-epiphany-newlib-devel cross-epiphany-newlib-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

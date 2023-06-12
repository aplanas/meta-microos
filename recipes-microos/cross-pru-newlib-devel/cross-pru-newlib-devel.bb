SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-pru-newlib-devel-4.3.0.20230120-2.1.aarch64.rpm"
RPM_HASH = "0cce460a9bc4fc9344792efd901c9908da7b6fa54dd5abad69c56c01fe2bb0172d8d46cc615cb000836a483eaa51d29266d64da8a5667bf65ee12600d6c50875"

RPROVIDES:${PN} += "cross-pru-newlib-devel cross-pru-newlib-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

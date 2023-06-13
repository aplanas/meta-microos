SUMMARY = "Static version of SuiteSparse libraries"
DESCRIPTION = "The suitesparse-static package contains the statically linkable \
version of the suitesparse libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "suitesparse-devel-static-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "f627707c0e770b60dd102c05e010a0e47940ca735b6bc503f97dace6f9f6b4bf6e329cfb2e5a29abe38e4df14f1ba33a57a819cfdc8bcd82f2d39694f53b7686"

RPROVIDES:${PN} += "suitesparse-devel-static \
suitesparse-devel-static(aarch-64)"

RDEPENDS:${PN} += "suitesparse-devel"

inherit rpm

SUMMARY = "C library for the subunit testing protocol"
DESCRIPTION = "Subunit C bindings.  See the python-subunit package for test processing \
functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-1.4.2-3.2.aarch64.rpm"
RPM_HASH = "4ed4dc544162a9d010c4559f7a23746282a3ee122722d8f7a3d1a0d9eba447e33ac70281c1d4791bd4e054259b5c2c2067342154fb45428dc2d5fed9867a20f3"

RPROVIDES:${PN} += "subunit"

RDEPENDS:${PN} += ""

inherit rpm

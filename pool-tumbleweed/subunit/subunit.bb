SUMMARY = "C library for the subunit testing protocol"
DESCRIPTION = "Subunit C bindings.  See the python-subunit package for test processing \
functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "1faaf81e7d41ea6785570e08449fd998a81df628aa3f4441b06ab70a67da1e1efe70124bb562a691e6a61a65edd7242afabf4f1d2cf1337c7af413d19173025b"

RPROVIDES:${PN} += "subunit"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Freebl library checksums for the Network Security Services"
DESCRIPTION = "Checksums for libraries contained in the libfreebl3 package \
used in the FIPS 140-2 mode."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "libfreebl3-hmac-3.89-2.1.aarch64.rpm"
RPM_HASH = "830875b2179b36c2b0980019477bb80c1ed0e289b963919270974678490d6a69f4bfe92da43985c86f2861eb6820d3bc7626583ad02fa0badc3a19a5bd8670b8"

RPROVIDES:${PN} += "libfreebl3-hmac"

RDEPENDS:${PN} += "libfreebl3"

inherit rpm

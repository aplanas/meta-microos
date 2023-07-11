SUMMARY = "Vector/matrix library for OpenEXR"
DESCRIPTION = "Vector/matrix library for OpenEXR."
LICENSE = "BSD-3-Clause"

PV = "3.1.9"

RPM_NAME = "libImath-3_1-29-3.1.9-1.1.aarch64.rpm"
RPM_HASH = "c7d0481b72ffe046e96886a8ecf58b1de99637b99d679b53457130c104ecf1795c061623a3c893d03a293f4a38d7b93dcc3bfbcf6265c3aae558a540e21e099b"

RPROVIDES:${PN} += "libImath-3-1-29 \
libImath-3-1.so.29"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

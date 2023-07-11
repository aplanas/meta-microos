SUMMARY = "A library providing Unicode character names and annotations"
DESCRIPTION = "libuninameslist provides Unicode name and annotation data from the official Unicode Character Database."
LICENSE = "BSD-3-Clause"

PV = "20230523"

RPM_NAME = "libuninameslist1-20230523-1.1.aarch64.rpm"
RPM_HASH = "3ecbae168841ded3c709d740c73eea4b62645054b5a4925b9ad75466ab3a309a188b4023e62f615859dc2bca7fdf5db573eae3978ede7e283a2213748dadb57b"

RPROVIDES:${PN} += "libuninameslist.so.1 \
libuninameslist1"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm

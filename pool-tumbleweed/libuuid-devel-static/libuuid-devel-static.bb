SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid-devel-static-2.39-1.1.aarch64.rpm"
RPM_HASH = "2c733351ac9e7988835fa6872a2985c49279d072f8f14b53d50cc481ace70cabe07bfcb45274735e16486ca8d69d636775147098382ff90dac1094e623f0b8ce"

RPROVIDES:${PN} += "libuuid-devel-static"

RDEPENDS:${PN} += "libuuid-devel"

inherit rpm

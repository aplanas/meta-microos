SUMMARY = "Headers for OpenCSD, a CoreSight Trace Decode library"
DESCRIPTION = "Header files and libraries for C and C++ development with OpenCSD."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "OpenCSD-devel-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "0eadb726d4359719b5215b075f352b43942aad47da26fe25513ececc38464bfaafae9e069adee43a353fd7846440ae51843791ef789f158ede1baeb58fa3b464"

RPROVIDES:${PN} += "OpenCSD-devel"

RDEPENDS:${PN} += "libopencsd-c-api1 \
libopencsd1"

inherit rpm

SUMMARY = "Headers for OpenCSD, a CoreSight Trace Decode library"
DESCRIPTION = "Header files and libraries for C and C++ development with OpenCSD."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "OpenCSD-devel-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "cb0804f6840326e6dc24d16e5a1fa479e9938e3f971314ac1d6b07adfdef18d0ab77d504312419198a7e3d0b0184c00e40f0b1bbb2ee0176d6d3aca0a6d7eab4"

RPROVIDES:${PN} += "OpenCSD-devel OpenCSD-devel(aarch-64)"
RDEPENDS:${PN} += "libopencsd1 libopencsd_c_api1"

inherit rpm

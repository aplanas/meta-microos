SUMMARY = "Development files for the Claw library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libclaw."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.4"

RPM_NAME = "libclaw-devel-1.7.4-4.10.aarch64.rpm"
RPM_HASH = "ae21adb33b254cfa72f9e7ff3d6b86a827c8763ddebd1a11142fbcf6c9351992502eefc144ab50e2403e02af44944abba5f169197eae2520b13aafbef5009c17"

RPROVIDES:${PN} += "cmake-libclaw \
libclaw-devel"

RDEPENDS:${PN} += "/bin/sh \
cmake \
libclaw1"

inherit rpm

SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-dummy-devel-0.189-4.1.aarch64.rpm"
RPM_HASH = "887e67c6855b6b092702cfc6684f55a3523a1f5afa4c8a021502660cf32c557476fb5bc73eb7894a9021108a02a8fdbe922b388c66fc96687e2fd9858f77d44a"

RPROVIDES:${PN} += "libdebuginfod-devel \
libdebuginfod-dummy-devel"

RDEPENDS:${PN} += "libdebuginfod1-dummy"

inherit rpm

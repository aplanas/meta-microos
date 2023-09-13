SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-dummy-devel-0.189-5.1.aarch64.rpm"
RPM_HASH = "1e2934af4b15c3869fd039140666733ed5ad7484374b4a1dbdeb92cdeebc9bf06b2ddda8dc77d1ccb4df0bd067de2ec47165de3ffe2f9a10e79721094bc014c5"

RPROVIDES:${PN} += "libdebuginfod-devel \
libdebuginfod-dummy-devel"

RDEPENDS:${PN} += "libdebuginfod1-dummy"

inherit rpm

SUMMARY = "Development files for libLimeSuite"
DESCRIPTION = "Libraries and header files for developing applications that want to make \
use of libLimeSuite."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "limesuite-devel-22.09.1-2.3.aarch64.rpm"
RPM_HASH = "3494337cb0dc3e2a3b062df1725006c1416f555ee238cbe1ead1f57b90c77dd3817086375dee093826522abeab9b41544e03ca8280a78e9d7dd39ba5484ff0bd"

RPROVIDES:${PN} += "cmake-LimeSuite \
limesuite-devel \
pkgconfig-LimeSuite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libLimeSuite22-09-1"

inherit rpm

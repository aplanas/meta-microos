SUMMARY = "Qt KMSSupport module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-kmssupport-devel-static-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1b0c1ecbf23fe05ec6c89dd84453bc5826915ec1901fb92865199a6b29e9ede006884e59f7213928e399020ac53bcff4469a0570b7541f3c5e34df757d773405"

RPROVIDES:${PN} += "cmake-Qt6KmsSupportPrivate \
qt6-kmssupport-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm

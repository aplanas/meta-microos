SUMMARY = "Qt KMSSupport module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-kmssupport-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d4b82ebc4e89b51c843d9aada22fb7465ef0046cc8a93447eb26ec8a51db79c4cbc83f5d2db5798f8b635b6e0bc0afdee6e4f30bafbf057a05cc3be3f35f0e5d"

RPROVIDES:${PN} += "cmake-Qt6KmsSupportPrivate \
qt6-kmssupport-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm

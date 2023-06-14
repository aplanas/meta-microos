SUMMARY = "Qt KMS support module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5KmsSupport-devel-static-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "6d8bd7c3e22bdad28ba268b492259084d7fc1e2766f671ec06d90bc72ab50f580272a64a647bc1484355963ef9b65f34e0dc6978d5f78054cf10789e44d496ab"

RPROVIDES:${PN} += "cmake-Qt5KmsSupport \
libQt5KmsSupport-devel-static"

RDEPENDS:${PN} += "libQt5Core-devel \
libQt5Gui-devel"

inherit rpm

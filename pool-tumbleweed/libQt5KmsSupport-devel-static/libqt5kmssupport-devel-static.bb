SUMMARY = "Qt KMS support module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5KmsSupport-devel-static-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "2a79be6166e0bfdc8ddd32b5f00c6aaebe03b920e229e6acdbc59f01bcd7eb3ce99fec0e39b67061357f37e43a2293d628557e8b7b5f083f115281fa5fed1c2f"

RPROVIDES:${PN} += "cmake-Qt5KmsSupport \
libQt5KmsSupport-devel-static"

RDEPENDS:${PN} += "libQt5Core-devel \
libQt5Gui-devel"

inherit rpm

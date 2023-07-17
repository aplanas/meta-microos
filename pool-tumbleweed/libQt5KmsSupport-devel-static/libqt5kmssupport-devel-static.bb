SUMMARY = "Qt KMS support module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5KmsSupport-devel-static-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "9ffb6992dce847d61995fc23eea2703c3db4cddf0570961333fefe8df42d92e83323e736e2c365b1726c3a257c28cdb12665f9998411ebedc97354fdb43f887f"

RPROVIDES:${PN} += "cmake-Qt5KmsSupport \
libQt5KmsSupport-devel-static"

RDEPENDS:${PN} += "libQt5Core-devel \
libQt5Gui-devel"

inherit rpm

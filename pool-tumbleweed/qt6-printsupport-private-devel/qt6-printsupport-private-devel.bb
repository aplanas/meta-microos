SUMMARY = "Non-ABI stable API for the Qt 6 PrintSupport library"
DESCRIPTION = "This package provides private headers of libQt6PrintSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-printsupport-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "3a546b8af13138f08e4241f68acb84c07c0d4707627942a6043101c2781daf34a6bb25fc24d021e0a3c9e37e8959b98a5c92936ef5d57e5e8f1f6b21447779b6"

RPROVIDES:${PN} += "qt6-printsupport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PrintSupport \
cups-devel \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm

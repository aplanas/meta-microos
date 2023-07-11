SUMMARY = "Non-ABI stable API for the Qt 6 QmlWorkerScript library"
DESCRIPTION = "This package provides private headers of libQt6QmlWorkerScript that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlworkerscript-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "282f4eff46d1ddd8adc1fa492e045f0956ce4f2fa26714a694b11d9ee7b70d8cb509f90ac4f1b0766a56e0c143fe63674ea8582bc4a27b98f077e31e8d8d88c8"

RPROVIDES:${PN} += "qt6-qmlworkerscript-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlWorkerScript \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm

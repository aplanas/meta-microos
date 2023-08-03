SUMMARY = "Qt 6 DeclarativeOpcua library"
DESCRIPTION = "Qt 6 DeclarativeOpcua library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6DeclarativeOpcua6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7a6ef6c7c830707f8c11fba10904bb59580cbcd7ead3eff06b234f9a1914b37bc58b1ecbf43888a8c39139aabb1b8cda2cba9d3538300054c84297f1a89197f9"

RPROVIDES:${PN} += "libQt6DeclarativeOpcua.so.6 \
libQt6DeclarativeOpcua6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpcUa.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

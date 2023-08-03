SUMMARY = "Non-ABI stable API for the Qt 6 DeclarativeOpcua library"
DESCRIPTION = "This package provides private headers of libDeclarativeOpcua that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-declarativeopcua-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2fe2e47e9fb7bde8d35b792278327a80ba712aae46cf83baea606205d67b9a644d82d441aa7944b6acabebd8d454a20c811a1a010b3fce0d7e7a0e383a5bd3b5"

RPROVIDES:${PN} += "cmake-Qt6DeclarativeOpcua \
pkgconfig-Qt6DeclarativeOpcua \
qt6-declarativeopcua-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpcUa \
cmake-Qt6Quick \
libQt6DeclarativeOpcua6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpcUa \
pkgconfig-Qt6Quick"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 DeclarativeOpcua library"
DESCRIPTION = "This package provides private headers of libDeclarativeOpcua that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarativeopcua-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8c35cda366842adac13b6a04c13d196e90998e1431db3bb8a548b4cf8761b5ff1abffbd468177558ecd45651aac3b4e2c4ce815e7b479a9cda799c52008894a5"

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

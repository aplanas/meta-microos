SUMMARY = "Non-ABI stable API for the Qt 6 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt6DBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-dbus-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "4afc6328284acaf19950d9d430c9bb8f6359377eb8188b3a3eea743422304faf9dcaff9c8650c45c73c93e245fe3d4651953cbcad527b0cd3d42ea3d5288a7f1"

RPROVIDES:${PN} += "qt6-dbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
qt6-core-private-devel"

inherit rpm

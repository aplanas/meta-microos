SUMMARY = "Non-ABI stable API for the Qt 6 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt6DBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-dbus-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "47543315e4074c32a75245f4a869c7c287f2e8378137b1f4db6e79270cd1712a27248a3a72d204a7e476db30f288096cb06060bb3ecf3aadd17f3a12bf2b77db"

RPROVIDES:${PN} += "qt6-dbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
qt6-core-private-devel"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt6DBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-dbus-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "19405ee17cbf4dec2c50c3b63db400ee2b5d7e4eed4266f4f41b54394586cc9c2cfdf91407984f67abe582650d2d02e56367c6750f0303eb565ad91d667bb235"

RPROVIDES:${PN} += "qt6-dbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
qt6-core-private-devel"

inherit rpm

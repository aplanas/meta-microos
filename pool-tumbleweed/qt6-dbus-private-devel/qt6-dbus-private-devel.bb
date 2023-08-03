SUMMARY = "Non-ABI stable API for the Qt 6 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt6DBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-dbus-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0ba1d952918a87a74fad6d92c5a451d7dacb43b88d57233ac2f82358e744dcda09ac753395411ff0e39cbf2b520a990c11c928feea147f84ca540004a6ec6026"

RPROVIDES:${PN} += "qt6-dbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
qt6-core-private-devel"

inherit rpm

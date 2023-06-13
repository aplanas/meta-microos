SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjectsQml library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjectsQml that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjectsqml-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3bb2118f087b385ce0ee3937cc8efb98bf9fe8e81cc5f505d9f2ff6d2979b035cbc8a94fdc717ad8857abfcdcc5335a44c82eab6835966d4b9673e8fd612d37e"

RPROVIDES:${PN} += "qt6-remoteobjectsqml-private-devel \
qt6-remoteobjectsqml-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6RemoteObjectsQml)"

inherit rpm

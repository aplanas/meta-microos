SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjectsQml library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjectsQml that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjectsqml-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a0c10e6122ccace87af3bdf08f293725a24ea15ca8277704f6da8899a8a8fe5afe3a5c2fd177343e3921bcbdc6d488fac1598940bb23a76d9c06d33045b180ce"

RPROVIDES:${PN} += "qt6-remoteobjectsqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6RemoteObjectsQml"

inherit rpm

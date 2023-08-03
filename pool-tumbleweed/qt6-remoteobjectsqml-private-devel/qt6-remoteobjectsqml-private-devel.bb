SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjectsQml library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjectsQml that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjectsqml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ac3b91ca31895c1cd3ba62823b65e218f67608f20a5093d2f07ed5100ecfb1a79522068dba8f1d14a190af0d99f9540853b37c3b8f8cbcf73339efb4fc51d39e"

RPROVIDES:${PN} += "qt6-remoteobjectsqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6RemoteObjectsQml"

inherit rpm

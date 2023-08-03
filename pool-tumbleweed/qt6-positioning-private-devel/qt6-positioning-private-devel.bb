SUMMARY = "Non-ABI stable API for the Qt 6 Positioning Library"
DESCRIPTION = "This package provides private headers of libQt6Positioning that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioning-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1fd3578709aa70013bde4f00ed7c56ca554946c460ec576658b3e759f317da378f938dcfec744f9445eaeb38cb5b13f1757b15cc866e9034194d8ffb27391784"

RPROVIDES:${PN} += "qt6-positioning-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Positioning"

inherit rpm

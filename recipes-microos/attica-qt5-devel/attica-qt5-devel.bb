SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Development files for attica, Attica a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "attica-qt5-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "09c12e4ef6221729705321848fadc4ca0f5a0bc0810411287a4def889929bbfcf2938029152f1a749bd27a40e3ebb8c4102fc19103751997b6b69a187fe2aadc"

RPROVIDES:${PN} += "attica-qt5-devel attica-qt5-devel(aarch-64) cmake(KF5Attica) pkgconfig(libKF5Attica)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt5Core) cmake(Qt5Network) cmake(Qt5Widgets) libKF5Attica5 pkgconfig(Qt5Core) pkgconfig(Qt5Network)"

inherit rpm

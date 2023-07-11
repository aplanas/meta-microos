SUMMARY = "Development files for the Qt5 3D library"
DESCRIPTION = "You need this package if you want to compile programs with qt3d."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qt3d-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "50d9e4fe9c5e001c9c9b2c7c6b47bb4a05cc007263f9e8f03d1fd75e180dee355f2c6f80386149b204b47eda4209b005c2172f5817b753b9f4dfa2a342ead487"

RPROVIDES:${PN} += "libQt53dCollision-devel \
libqt5-qt3d-devel"

RDEPENDS:${PN} += "libQt53DAnimation-devel \
libQt53DCore-devel \
libQt53DExtras-devel \
libQt53DInput-devel \
libQt53DLogic-devel \
libQt53DQuick-devel \
libQt53DQuickAnimation-devel \
libQt53DQuickExtras-devel \
libQt53DQuickInput-devel \
libQt53DQuickRender-devel \
libQt53DQuickScene2D-devel \
libQt53DRender-devel"

inherit rpm

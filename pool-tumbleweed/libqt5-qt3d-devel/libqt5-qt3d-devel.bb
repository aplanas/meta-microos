SUMMARY = "Development files for the Qt5 3D library"
DESCRIPTION = "You need this package if you want to compile programs with qt3d."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qt3d-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "9faae424c7a77365a6c10a7a951d4a59745d89e350e2d4162beb86c4404388b7516b5cd815163b3386f76043e845044b6af80a4f7f6ee4be9586bf7cc9904498"

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

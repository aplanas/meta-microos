SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "3d1aaac27b77b131d0df67d24e3ad119fc6d8e38c21851a963fb8baa05147ae7d2cba2ca2e0f7f70fda108805618cc8d5534a01a01449e9de358a86c8bdd553e"

RPROVIDES:${PN} += "python3-PyQt6-3D \
python3-qt3d-qt6 \
python3.11dist-pyqt6-3d \
python311-PyQt6-3D \
python311-qt3d-qt6 \
python3dist-pyqt6-3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-PyQt6"

inherit rpm

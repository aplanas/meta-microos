SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-3D-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "cde28f915aac661b67064bfffb493b212ac2b8e767b6f0d210b254d8127269c40671ecc084b10206e5065dbd189025523f915643fcf3c66989159d005aee62dc"

RPROVIDES:${PN} += "python3.9dist-pyqt6-3d \
python39-PyQt6-3D \
python39-qt3d-qt6 \
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
python39-PyQt6"

inherit rpm

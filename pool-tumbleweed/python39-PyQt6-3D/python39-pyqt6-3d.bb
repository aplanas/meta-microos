SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-3D-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "959bf3cd3fd5fc45cc3ad58f358978bd8ba3b4abcc62f2c9e40072a36f57e5527e57ef980406ffd596f041a8c270ac709721d7aa0158fda361b7e249ab34eb21"

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

SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "e1d5cd2cd6b089c65dee36f3fd12916edc88fd429e4e6a8dac80ef2e561fff3b8a7cd93773fb58689ec9be02ccb8c4dec9ae6940a444723c62d57674fdd01eb8"

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

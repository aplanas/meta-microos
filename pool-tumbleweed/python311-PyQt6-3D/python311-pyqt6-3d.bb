SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "78399fa92e640df3993f12bc02417e1200aa54b00ad2e943f493d49fd26a803eae6cf034ebece3e1ad78ec5d999db217015de4d1c6facce922ce77dfe360b1c7"

RPROVIDES:${PN} += "python3.11dist-pyqt6-3d \
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

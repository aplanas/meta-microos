SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qt3d-qt5-5.15.6-1.6.aarch64.rpm"
RPM_HASH = "b095c82d1679def1e58dda4b690cd6a0fba06e0605a3e37ea312caf1e0f1aa3064b86665b5775bbd51bc98fa975e31994457ce1ead1e4e046df39883a3e978d6"

RPROVIDES:${PN} += "python3.11dist-pyqt3d \
python311-PyQt3D \
python311-qt3d-qt5 \
python3dist-pyqt3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-qt5 \
python311-qt5-sip"

inherit rpm

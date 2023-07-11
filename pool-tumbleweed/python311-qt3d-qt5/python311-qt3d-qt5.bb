SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qt3d-qt5-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "9d425539e6d254232c3fcb425edc3d4d01f8920a5a553d884d26ffb565a323b1dff13792820c02e6623e6825bbbb20ca43513e3e915a219d42012d36648916b3"

RPROVIDES:${PN} += "python3-PyQt3D \
python3-qt3d-qt5 \
python3.11dist-pyqt3d \
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

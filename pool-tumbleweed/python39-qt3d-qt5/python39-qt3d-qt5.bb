SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qt3d-qt5-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "3e5dc258940b7b85df24a6fa93650d9c293a6b3d7083041f7b0e614d9537935186bd1df4256c180b133af361541418179b050924e85b01595c58dc30dc7a853c"

RPROVIDES:${PN} += "python3.9dist-pyqt3d \
python39-PyQt3D \
python39-qt3d-qt5 \
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
python39-qt5 \
python39-qt5-sip"

inherit rpm

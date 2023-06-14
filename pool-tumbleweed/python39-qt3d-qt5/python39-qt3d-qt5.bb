SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qt3d-qt5-5.15.6-1.6.aarch64.rpm"
RPM_HASH = "efa953a567dfa8ad1469058061edf4983e8f73d4578878ecdd5e7f03f95b07739149571d542c306f91c77c3a62b5287634ffb3fe9e834c3af0537958c4df5e63"

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

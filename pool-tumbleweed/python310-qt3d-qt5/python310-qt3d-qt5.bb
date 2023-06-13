SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qt3d-qt5-5.15.6-1.6.aarch64.rpm"
RPM_HASH = "8e214fdab2ac3a1bcfbcc94bba57c62e9dd5e6b72c3b9497416ae020ab41a9b7aae7169ff9a0919a3073fc2c055c21acce5d102830c56e1fe11d61c1ab004dd8"

RPROVIDES:${PN} += "python3-PyQt3D \
python3-qt3d-qt5 \
python3.10dist(pyqt3d) \
python310-PyQt3D \
python310-qt3d-qt5 \
python310-qt3d-qt5(aarch-64) \
python3dist(pyqt3d)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt53DAnimation.so.5()(64bit) \
libQt53DAnimation.so.5(Qt_5)(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DExtras.so.5()(64bit) \
libQt53DExtras.so.5(Qt_5)(64bit) \
libQt53DInput.so.5()(64bit) \
libQt53DInput.so.5(Qt_5)(64bit) \
libQt53DLogic.so.5()(64bit) \
libQt53DLogic.so.5(Qt_5)(64bit) \
libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-qt5 \
python310-qt5-sip"

inherit rpm

SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qt3d-qt5-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "d9a8a4ee2ade5018b83d4141279db88799cdaaa047bedbc7ea5bd218cc7e61795ba1c6d37d234881660f21900fe68cc3b072a7cb2323358c8b2672bddaedb649"

RPROVIDES:${PN} += "python3.10dist-pyqt3d \
python310-PyQt3D \
python310-qt3d-qt5 \
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
python310-qt5 \
python310-qt5-sip"

inherit rpm

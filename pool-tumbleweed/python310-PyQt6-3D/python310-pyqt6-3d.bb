SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-3D-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "339afec23c3f35bb8fa92939eb5b4a3824812bd58eb507752caf61afad969a838d0d59dab7c82fdc7609680f2f7b4a3ab2db156325584b909e727df8bbf536fd"

RPROVIDES:${PN} += "python3.10dist-pyqt6-3d \
python310-PyQt6-3D \
python310-qt3d-qt6 \
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
python310-PyQt6"

inherit rpm

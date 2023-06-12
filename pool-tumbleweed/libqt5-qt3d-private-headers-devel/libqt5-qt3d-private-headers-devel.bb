SUMMARY = "Non-ABI stable experimental API for the Qt5 3D library"
DESCRIPTION = "This package provides private headers of libqt5-qt3d that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qt3d-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "f62ef8f44b16a756fd7017478ef0d48d893d6b7b9a2e312927e2e78557173533be6ae16dc8f5ce635d8d93549b27671894acc4e7af3757ed36289fcd38d9399a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qt3d-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5OpenGLExtensions-devel-static \
libqt5-qt3d-devel \
libqt5-qtdeclarative-private-headers-devel"

inherit rpm

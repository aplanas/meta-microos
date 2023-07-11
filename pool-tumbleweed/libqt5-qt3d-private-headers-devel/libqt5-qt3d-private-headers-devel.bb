SUMMARY = "Non-ABI stable experimental API for the Qt5 3D library"
DESCRIPTION = "This package provides private headers of libqt5-qt3d that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qt3d-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "77a21ac8bbeee3f9d04168e7ce54e4020824a153645b1b80f791d4f4b84d83e408e784be6fa3a3fd8dfb1251f17c6af64907b5a1756ba14e7bb2671e1c580f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qt3d-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5OpenGLExtensions-devel-static \
libqt5-qt3d-devel \
libqt5-qtdeclarative-private-headers-devel"

inherit rpm

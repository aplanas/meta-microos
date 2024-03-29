SUMMARY = "Non-ABI stable experimental API for the Qt5 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt5OpenGL that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGL-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "7a42772d03f397250b843cec4201c7c6092618ade198513a8390ac93f48063d4c46812beb00c08f6a6152da1c00160d1c708758cd27658998953aeffc324aad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5OpenGL-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5OpenGL-devel \
libQt5Widgets-private-headers-devel"

inherit rpm

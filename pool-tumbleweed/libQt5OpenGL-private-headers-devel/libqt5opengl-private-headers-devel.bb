SUMMARY = "Non-ABI stable experimental API for the Qt5 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt5OpenGL that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGL-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "c8bd7c266f2f99709d14c68746659b2266e2acf6c57e592515d79a963742d7bea6ab6e7f729900593cebe77cdd712fbbb86b22eda80046bff22dc260301b0191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5OpenGL-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5OpenGL-devel \
libQt5Widgets-private-headers-devel"

inherit rpm

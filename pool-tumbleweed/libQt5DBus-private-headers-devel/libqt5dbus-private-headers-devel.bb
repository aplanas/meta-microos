SUMMARY = "Non-ABI stable experimental API for the Qt5 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt5DBus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5DBus-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "65f76d94478af15b727785563063976466dfc09509ccaee47c8e93ec9a2d18b7c32a760fd6d001a3b73a3f2a84066421d1260d848b947e117ffc4a10c636a60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5DBus-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5DBus-devel"

inherit rpm

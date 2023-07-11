SUMMARY = "Non-ABI stable experimental API for the Qt5 WebChannel library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebchannel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qtwebchannel-private-headers-devel-5.15.10+kde3-1.1.noarch.rpm"
RPM_HASH = "d08b31442ae5f700ae13beb33c0a9c3ffc68db5fd044e6a1eaa213bebf81f36ae91ccdeefec4c1b4fa610c2e84367c7146312b41547499e157ed23596382e938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebchannel-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtwebchannel-devel"

inherit rpm

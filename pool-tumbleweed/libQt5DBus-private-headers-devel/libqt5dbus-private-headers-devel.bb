SUMMARY = "Non-ABI stable experimental API for the Qt5 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt5DBus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5DBus-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "ee5d226ee32c1651e2de5098905d70722c87b14eb1bcf2a44b20ec6317597fdbc80746d527f26925ca9d76b2d24870d65e18b64250134b3c666c2775e310d6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5DBus-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5DBus-devel"

inherit rpm

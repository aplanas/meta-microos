SUMMARY = "Non-ABI stable experimental API for the  Qt5 platform support library"
DESCRIPTION = "This package provides private headers of libQt5PlatformSupport that \
are normally not used by application development and that do not have \
any ABI or API guarantees. The packages that build against these have \
to require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PlatformSupport-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "de499d709df9cad4f5e1cb84417171447d1312e9f19b45387c64b721e97a140f94ce599a1c60d66396051ab905cdfdd26411b314612f1c9d9e532b2a95deeb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PlatformSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PlatformSupport-devel-static"

inherit rpm

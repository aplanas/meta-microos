SUMMARY = "Non-ABI stable experimental API for the Qt5 core library"
DESCRIPTION = "This package provides private headers of libQt5Core that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Core-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "23dc2555b88d70e7b34b084d6f6dcc8aa7753ea6ee5a3f09562d6127b9bc1a9c94ec3f5a993c22d9f9739666add0f3b4e10db38d78f65f236970346decaa5256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Core-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-devel"

inherit rpm

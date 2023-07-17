SUMMARY = "Non-ABI stable experimental API for the Qt5 KMS support library"
DESCRIPTION = "This package provides private headers of libQt5KmsSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5KmsSupport-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "fbfc594add41702d1b7ccee8c565e3fedca4575f7a7ff8a3cd196123377f66fc41b7e894bc1a62d8718ba77e168304f7de2d83a1bab2e0c73223e2d00dae7561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5KmsSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5KmsSupport-devel-static"

inherit rpm

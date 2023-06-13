SUMMARY = "Non-ABI stable experimental API for the  Qt5 platform support library"
DESCRIPTION = "This package provides private headers of libQt5PlatformSupport that \
are normally not used by application development and that do not have \
any ABI or API guarantees. The packages that build against these have \
to require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5PlatformSupport-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "86a2a98f37a847a264bddace0af57eee79a65ff780fb2dea54ffd31379a4d9edc7afc41f1e948a6dc99109339a37a489c43883a30d485e0b5f44f85a5231ccea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PlatformSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PlatformSupport-devel-static"

inherit rpm

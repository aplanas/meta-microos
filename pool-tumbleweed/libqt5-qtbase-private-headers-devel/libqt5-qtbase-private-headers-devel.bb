SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtbase-devel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "e5c1e2c3293e43aae66ce685e46c0964bff5fd6a19f848b88bb26e4345bb844c0cca1389db80d570fd025687acc7d83bb7349526155042bca3047f9c9952a71b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtbase-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5DBus-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5KmsSupport-private-headers-devel \
libQt5Network-private-headers-devel \
libQt5OpenGL-private-headers-devel \
libQt5PlatformSupport-private-headers-devel \
libQt5PrintSupport-private-headers-devel \
libQt5Sql-private-headers-devel \
libQt5Test-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtbase-devel"

inherit rpm

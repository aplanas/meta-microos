SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtbase-devel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "3d116ede9b25891846400d28084ba9e008af74fc1863f5a5a081748bc884d6f3046829585c979afbc5513ca6e52ebcb92e5c02b6c18b5992f719e62b9ea0b6ec"
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

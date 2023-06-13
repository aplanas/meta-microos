SUMMARY = "Non-ABI stable experimental API for the Qt5 print support library"
DESCRIPTION = "This package provides private headers of libQt5PrintSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5PrintSupport-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "4d74364aa29e97277708620ec4ee53b879e1abf58434bc828b63db60bef8a6091588ddd7ea17a0397f0f9dcd6c0e1994a2f9aabd025e1c87d020c478b77d9e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PrintSupport-private-headers-devel"

RDEPENDS:${PN} += "cups-devel \
libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PrintSupport-devel \
libQt5Widgets-private-headers-devel"

inherit rpm

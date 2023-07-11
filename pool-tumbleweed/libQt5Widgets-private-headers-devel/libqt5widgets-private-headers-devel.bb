SUMMARY = "Non-ABI stable experimental API for the Qt5 widgets library"
DESCRIPTION = "This package provides private headers of libQt5Widgets that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Widgets-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "1819764c6ca7069abae583a8412589be181336d218fe31c18096079705873112584703200fcee977433dc6c1f9776daf9a20d7ab9f5121775df6c2390acb662a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Widgets-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5Widgets-devel"

inherit rpm

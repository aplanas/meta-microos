SUMMARY = "Non-ABI stable experimental API for the Qt5 print support library"
DESCRIPTION = "This package provides private headers of libQt5PrintSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PrintSupport-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "f72728bd564a3973c68895ab52dd21763797f2a16878f391c6eb83eecb7c6d88dffdd70e652d00d8db2c8aa7a526b2f625b7b8badad9d0b506798994f3e8187c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PrintSupport-private-headers-devel"

RDEPENDS:${PN} += "cups-devel \
libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PrintSupport-devel \
libQt5Widgets-private-headers-devel"

inherit rpm

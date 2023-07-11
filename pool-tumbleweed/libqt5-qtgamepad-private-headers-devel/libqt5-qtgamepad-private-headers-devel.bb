SUMMARY = "Non-ABI stable experimental API for the Qt5 gamepad library"
DESCRIPTION = "This package provides private headers of libqt5-qtgamepad that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtgamepad-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "127d7404f6d04d58d6ce2eadd93fded9231263897cf9bb53566b9a0131537364a23792da815f93f7329fec90779b0229441dfc804f1418f945c208f054d1dcb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtgamepad-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtgamepad-devel"

inherit rpm

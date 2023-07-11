SUMMARY = "Non-ABI stable experimental API for the Qt5 Tools library"
DESCRIPTION = "This package provides private headers of libqt5-qttools that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qttools-private-headers-devel-5.15.10+kde3-1.1.noarch.rpm"
RPM_HASH = "d6ddb07c56e0ef33f316e6dee7d21dcbf755484f6b786c7c0b821cc928a6d061a27d5bd33bd912492390c9e0a2f9b7abee6d5932f73232ea52af3a99ae4e2e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qttools-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qttools-devel"

inherit rpm

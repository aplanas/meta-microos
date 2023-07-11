SUMMARY = "Non-ABI stable experimental API for the Qt5 Script library"
DESCRIPTION = "This package provides private headers of libqt5-qtscript that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtscript-private-headers-devel-5.15.14-1.1.noarch.rpm"
RPM_HASH = "794c54bfabff05c14e1d1683d2d9d83efb3ba2810897146c4b8635b91406878561a340a37dac34eca7fe7a8ead5d400d31e9a03e821f3499a71cc0b886724964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Script-private-headers-devel \
libqt5-qtscript-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtscript-devel"

inherit rpm

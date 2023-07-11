SUMMARY = "Non-ABI stable experimental API for the Qt5 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libqt5-qtremoteobjects that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtremoteobjects-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "12e62b813b496da77b7e67dd4cf52dbb769912117ac4d36f10fcc68869e857529bc98d570d42580fb45482240e606df0f15b8a92dbd986afdb0080f8a089d625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtremoteobjects-devel"

inherit rpm

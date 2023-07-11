SUMMARY = "Non-ABI stable experimental API for the Qt5 Sensors library"
DESCRIPTION = "This package provides private headers of libqt5-qtsensors that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtsensors-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "8bdcd23a6b571245d1b946ca29b11ca5186e6701ab4b682938bc0736c34db5b959fb113f041195e4ea5ed175e518d5d9ddcf54911b030586f6879967c6809387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sensors-private-headers-devel \
libqt5-qtsensors-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtsensors-devel"

inherit rpm

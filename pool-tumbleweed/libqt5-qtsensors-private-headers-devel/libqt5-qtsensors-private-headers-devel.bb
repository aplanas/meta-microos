SUMMARY = "Non-ABI stable experimental API for the Qt5 Sensors library"
DESCRIPTION = "This package provides private headers of libqt5-qtsensors that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtsensors-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "99c122916622bcd93c61a50d029958cce1174aa86c14df1449f6e831670fd17859db0d18b738740f3d785fc438f9829f8127fad2b7bf349e78240f118169541e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sensors-private-headers-devel \
libqt5-qtsensors-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtsensors-devel"

inherit rpm

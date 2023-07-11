SUMMARY = "Non-ABI stable experimental API for the Qt5 SerialPort library"
DESCRIPTION = "This package provides private headers of libqt5-qtserialport that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtserialport-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "cc83177319079276952be77df0b780f4713db87313c4ecfe8fe3374ff232808905a8d6364d9e57890919c461342ac84cccc14704a6afcbd7771fbe8276010337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5SerialPort-private-headers-devel \
libqt5-qtserialport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtserialport-devel"

inherit rpm

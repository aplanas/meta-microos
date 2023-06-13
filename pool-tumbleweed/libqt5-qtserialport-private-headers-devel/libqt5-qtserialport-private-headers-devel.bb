SUMMARY = "Non-ABI stable experimental API for the Qt5 SerialPort library"
DESCRIPTION = "This package provides private headers of libqt5-qtserialport that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtserialport-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "c2612d0c3b9c1f7125587d11bec6f7fa6d92a1a743227d7316220d1f9a4ddfe5fbacef0bc691287da06730d608e2a816a8c54575750aa3227bdb4f1f555d85ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5SerialPort-private-headers-devel \
libqt5-qtserialport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtserialport-devel"

inherit rpm

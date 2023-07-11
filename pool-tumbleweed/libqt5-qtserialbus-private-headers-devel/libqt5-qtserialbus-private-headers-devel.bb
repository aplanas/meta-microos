SUMMARY = "Non-ABI stable experimental API for the Qt5 SerialBus library"
DESCRIPTION = "This package provides private headers of libqt5-qtserialbus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtserialbus-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "7b85931f19353f51af5885540d7e41a0d2e6d35eef81f4ab1bf99134617483d1e5527e6730ef741adcfb13948c5365cd8e07ffd73bf1d0b66eb357fb7f859e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtserialbus-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtserialbus-devel"

inherit rpm

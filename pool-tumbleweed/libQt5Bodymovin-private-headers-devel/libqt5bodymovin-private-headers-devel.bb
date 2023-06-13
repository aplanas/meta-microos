SUMMARY = "Headers for the unstable API of the Qt5 BodyMovin library"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 BodyMovin library."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Bodymovin-private-headers-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "60b974cb64918688394a0ffa399dc1d284887061bd441483d8bf3cdf0bcc2eb744d4d38552125324acf75279146d98981db126d03776a0c0b1795b1984d9ae6d"

RPROVIDES:${PN} += "libQt5Bodymovin-private-headers-devel \
libQt5Bodymovin-private-headers-devel(aarch-64)"

RDEPENDS:${PN} += "libQt5Bodymovin-devel"

inherit rpm

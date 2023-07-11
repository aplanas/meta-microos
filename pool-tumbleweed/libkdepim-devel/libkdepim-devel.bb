SUMMARY = "Development package for libkdepim"
DESCRIPTION = "The development package for the libkdepim libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkdepim-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "76f3f27fd765e360bcf5f4f966ec989bd2055dc2b417c6ef570d0110a8ddb66cdbd080cb5a593fec03c3ad1ebe36d56c4ec3d99d2d9a11545213eadaba79ed45"

RPROVIDES:${PN} += "cmake-KF5Libkdepim \
cmake-KPim5Libkdepim \
cmake-KPim5MailTransportDBusService \
cmake-MailTransportDBusService \
libkdepim-devel"

RDEPENDS:${PN} += "cmake-KPim5Akonadi \
cmake-KPim5AkonadiContact \
libKPim5Libkdepim5 \
libkdepim"

inherit rpm

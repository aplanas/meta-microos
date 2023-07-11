SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with the Qt BodyMovin \
library."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Bodymovin-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c164699a736b2b171be80926bed125d243279111dfc3f7224d349d913151f5af17d8675b979f12436941e6c1c6858f7e05552e59b63ac20f1e800816a458f757"

RPROVIDES:${PN} += "cmake-Qt5Bodymovin \
libQt5Bodymovin-devel"

RDEPENDS:${PN} += "libQt5Bodymovin5"

inherit rpm

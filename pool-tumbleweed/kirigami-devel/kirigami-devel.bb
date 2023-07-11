SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1+"

PV = "1.1.0"

RPM_NAME = "kirigami-devel-1.1.0-1.33.aarch64.rpm"
RPM_HASH = "e4deebda86d6c324d4b440c39a28d9a5c9a34e3c96620c76113f9382550dc78c94d94162838892669d152357942085f4410df6338810445069872671d574b0b5"

RPROVIDES:${PN} += "cmake-KF5Kirigami \
kirigami-devel"

RDEPENDS:${PN} += "kirigami"

inherit rpm

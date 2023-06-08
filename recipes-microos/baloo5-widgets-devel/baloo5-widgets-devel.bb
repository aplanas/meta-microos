SUMMARY = "Development package for baloo5-widgets"
DESCRIPTION = "Development package for baloo5-widgets"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "baloo5-widgets-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bda817d017938ce4906db3f8726e4cf192329aa6ce1fe516a4d23c706c9ee4cfc22b134f761430c61c96d6fe5428243440e194ba9b3f62f83209fbdff088cc9a"

RPROVIDES:${PN} += "baloo-widgets5-devel baloo5-widgets-devel baloo5-widgets-devel(aarch-64) cmake(KF5BalooWidgets)"
RDEPENDS:${PN} += "baloo5-widgets cmake(KF5KIO) cmake(Qt5Widgets)"

inherit rpm

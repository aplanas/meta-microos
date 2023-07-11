SUMMARY = "Development package for baloo5-widgets"
DESCRIPTION = "Development package for baloo5-widgets"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "baloo5-widgets-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cc14a10e5ba7949600f151212241aa0a8a9aeffb7106c0f027c723031a2001d33745e9935acd6e08ac80a463e6cdb360e30a5eded3447b4780c8e922ad70c456"

RPROVIDES:${PN} += "baloo-widgets5-devel \
baloo5-widgets-devel \
cmake-KF5BalooWidgets"

RDEPENDS:${PN} += "baloo5-widgets \
cmake-KF5KIO \
cmake-Qt5Widgets"

inherit rpm

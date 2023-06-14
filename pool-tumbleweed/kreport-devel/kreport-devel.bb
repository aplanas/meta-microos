SUMMARY = "Development package for KReport"
DESCRIPTION = "Development package for the Report Creation and Generation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kreport-devel-3.2.0-4.11.aarch64.rpm"
RPM_HASH = "3916d29edee5bba74716fd094ca27a1d39f3f974c5cfe55fe015dfb3e28fef94b3869a4061f012162c8f58ea2b9ae3e35c7a186285df937e76bd3239910b37b3"

RPROVIDES:${PN} += "cmake-KReport \
kreport-devel"

RDEPENDS:${PN} += "cmake-KPropertyCore \
cmake-Qt5Qml \
libKReport3-4"

inherit rpm

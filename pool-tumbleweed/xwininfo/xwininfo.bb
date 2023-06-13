SUMMARY = "Window information utility for X"
DESCRIPTION = "xwininfo prints information about windows on an X server."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "xwininfo-1.1.6-1.1.aarch64.rpm"
RPM_HASH = "52cc1896359aff7e3bdfa812725d0c563164d6d30079d8e7b6baf7d3391d6bb1981369212129656fe8fcb1387c603207a8b484e3d83dc28919642d4e9971063d"

RPROVIDES:${PN} += "xwininfo \
xwininfo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm

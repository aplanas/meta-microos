SUMMARY = "Utility to set an X Input device as the main pointer"
DESCRIPTION = "Xsetpointer sets an XInput device as the main pointer."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xsetpointer-1.0.1-9.28.aarch64.rpm"
RPM_HASH = "420c01a329eec33f1a04ab089666ff237576e379c52942137bfcd7511345005ec02832a34012dd1de66227ff165b1a17145004d85109bc4be7d7de83d928f2d8"

RPROVIDES:${PN} += "xsetpointer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6"

inherit rpm

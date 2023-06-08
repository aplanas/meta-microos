SUMMARY = "Utilities for Controller Area Networks from the Pengutronix project"
DESCRIPTION = "SocketCAN userspace utilities and tools from Pengutronix. \
 \
CAN is a message-based network protocol designed for vehicles \
originally initially created by Robert Bosch GmbH. SocketCAN is a set \
of CAN drivers and a networking stack contributed by Volkswagen \
Research to the Linux kernel. \
 \
This package contains some userspace utilities for the Linux \
SocketCAN subsystem: canconfig candump canecho cansend cansequence."
LICENSE = "GPL-2.0-only"

PV = "4.0.6.g26"

RPM_NAME = "canutils-pengutronix-4.0.6.g26-1.10.aarch64.rpm"
RPM_HASH = "60ca6f2eaa19fe6b18db789081fa1302a382a4b7c379712bf5f443b960a326dc100c58b397481e6597c88c5a0ff806e67d1b303608dbae77c5c83ad7af023c3a"

RPROVIDES:${PN} += "canutils-pengutronix canutils-pengutronix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsocketcan.so.2()(64bit)"

inherit rpm

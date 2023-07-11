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

RPM_NAME = "canutils-pengutronix-4.0.6.g26-1.11.aarch64.rpm"
RPM_HASH = "e3c5376ae7d2d8b11165758ad930a8456cebcfad16497b813ca7cf6074ff5cb2f5f153e1b39da50c544aea38c5b10ad642f2b3ff56b1bd6ca689f20a782076ed"

RPROVIDES:${PN} += "canutils-pengutronix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsocketcan.so.2"

inherit rpm

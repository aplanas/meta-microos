SUMMARY = "Utilities for Controller Area Networks from the Linux-CAN project"
DESCRIPTION = "SocketCAN userspace utilities and tools. \
 \
CAN is a message-based network protocol designed for vehicles \
originally initially created by Robert Bosch GmbH. SocketCAN is a set \
of CAN drivers and a networking stack contributed by Volkswagen \
Research to the Linux kernel. \
 \
This package contains some userspace utilities for the Linux \
SocketCAN subsystem."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2023.03"

RPM_NAME = "canutils-2023.03-1.4.aarch64.rpm"
RPM_HASH = "4b98fd80618c7dd8a2f77c16951e6579000e874236b65c97e6beb3bf762a05822e1381bccf09b4e22c09946bfc46287ff9afee801d5c4b3d5879000e8603cfb4"

RPROVIDES:${PN} += "can-utils \
canutils \
canutils-linuxcan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

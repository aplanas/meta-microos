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

RPM_NAME = "canutils-2023.03-1.3.aarch64.rpm"
RPM_HASH = "2229328651666f7cb713dbb4ab542cbe2f2cfb5fe7906f4ae4734286a1c5b5f0ee3a6b10a4cb0b1ddb12b5616b5a3e30950999c75dcd52ca1818fde673170657"

RPROVIDES:${PN} += "can-utils \
canutils \
canutils(aarch-64) \
canutils-linuxcan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

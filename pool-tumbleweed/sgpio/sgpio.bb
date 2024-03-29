SUMMARY = "SGPIO captive backplane tool"
DESCRIPTION = "Serial General Purpose Input Output (SGPIO) is a communication method used \
between a main board and a variety of internal and external hard disk drive \
bay enclosures. This utility can be used to control LEDs in an enclosure. \
For more information about SGPIO, please consult the  SFF-8485 \
Specification."
LICENSE = "GPL-2.0+"

PV = "1.2.1"

RPM_NAME = "sgpio-1.2.1-25.23.aarch64.rpm"
RPM_HASH = "1ca33d9e3fc2a3dff9599f4913de70cefa3205822285fb14e9fe9b57bddac3f7501070e660777252f15361f7231051bfd41c23194e17955d5399b8ab820e41fb"

RPROVIDES:${PN} += "sgpio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

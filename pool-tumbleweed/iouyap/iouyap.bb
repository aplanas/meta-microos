SUMMARY = "Bridge IOU to TAP, UDP and Ethernet"
DESCRIPTION = "Bridge IOU to TAP, UDP and Ethernet, mainly used by gns3server \
 \
In order to use iouyap as non-root user, the user needs to be member of the iouyap group!"
LICENSE = "GPL-3.0-or-later"

PV = "0.97"

RPM_NAME = "iouyap-0.97-2.11.aarch64.rpm"
RPM_HASH = "9887c7f8424f6c7eead1bb3dc4434e2aaaa4177d725c295f8936672e19027c7907813525df7f33c1697c935ecae1b8383f22328a37ce3dbb41d9a8a7ff046aca"

RPROVIDES:${PN} += "iouyap \
iouyap(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
permissions \
shadow"

inherit rpm

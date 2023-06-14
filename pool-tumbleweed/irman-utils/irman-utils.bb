SUMMARY = "Library for irman access"
DESCRIPTION = "Utilities from libirman from the lirc project."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "irman-utils-0.5.2-5.12.aarch64.rpm"
RPM_HASH = "0d9b57f788d48031ceae48146d14cfe82083699ec146004d3818bd1d7bd547d69b26e49f96dcd8b016d0f197b0c5362c091971b9ea78cb3ff5ee3a290aabcede"

RPROVIDES:${PN} += "irman-utils \
libirman-utils"

RDEPENDS:${PN} += "irman-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libirman.so.0"

inherit rpm

SUMMARY = "NVMe Managament Interface library for libnvme"
DESCRIPTION = "Provides library functions for managing NVMe devices via the NVMe \
Managament Interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme-mi1-1.4-1.3.aarch64.rpm"
RPM_HASH = "7d7dee3e3a3bcd2aa74f5e93a2f041f9d757c01399126b0b76d0e5778184ff1397af5d505921535e5c34e46c74b8393f4a575e2e517faead55156c778a0062e4"

RPROVIDES:${PN} += "libnvme-mi.so.1 \
libnvme-mi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

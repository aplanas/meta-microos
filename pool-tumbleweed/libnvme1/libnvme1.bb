SUMMARY = "Linux-native nvme device management library"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme1-1.4-1.3.aarch64.rpm"
RPM_HASH = "7c368e82de9d04bd111de771d2f1cf3a9dab4a6a6151991b1be2ee07471ddf8890f3b27e2ec2f9e5b1924f8131d681f240f25d57e63723a69aac57e84a2ade2c"

RPROVIDES:${PN} += "libnvme.so.1 \
libnvme1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libkeyutils.so.1"

inherit rpm

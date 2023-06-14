SUMMARY = "Linux-native nvme device management library"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme1-1.4-1.1.aarch64.rpm"
RPM_HASH = "f27126530014eed704a3c903cec417c7f5de829e8ea633d760b12bac94ca5a9ba483d6acb996b5ac5a6de43f1761055ce2ea9511272293c4425d64c634f8e11f"

RPROVIDES:${PN} += "libnvme.so.1 \
libnvme1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libkeyutils.so.1"

inherit rpm

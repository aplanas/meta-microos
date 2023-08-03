SUMMARY = "Linux-native nvme device management library"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme1-1.4-3.1.aarch64.rpm"
RPM_HASH = "dc3a79ceea78a0146c6694cc58ba5e18fe0493997cb462b94beb725da06c4f0cbc5f4d96f6cb8e84a2fb9a8ec3e1b895d7510fe73ce313509311da0ae115aabd"

RPROVIDES:${PN} += "libnvme.so.1 \
libnvme1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libkeyutils.so.1"

inherit rpm

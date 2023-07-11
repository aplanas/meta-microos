SUMMARY = "CacheFiles userspace management daemon"
DESCRIPTION = "cachefilesd is a user-space management daemon for CacheFiles, a generic \
caching framework for mounted filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.10"

RPM_NAME = "cachefilesd-0.10.10-1.12.aarch64.rpm"
RPM_HASH = "2656fe718410b3f8ee30b934d9996c47d6e24b1321997824a915909156d2c372ea074e3efb0718e46020dc73d85bcd202f2a1c4d132f7e78e0a0789c76d1b634"

RPROVIDES:${PN} += "cachefilesd \
config-cachefilesd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
systemd"

inherit rpm

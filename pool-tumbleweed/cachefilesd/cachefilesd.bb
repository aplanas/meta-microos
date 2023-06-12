SUMMARY = "CacheFiles userspace management daemon"
DESCRIPTION = "cachefilesd is a user-space management daemon for CacheFiles, a generic \
caching framework for mounted filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.10"

RPM_NAME = "cachefilesd-0.10.10-1.11.aarch64.rpm"
RPM_HASH = "e23c029472d0bc244f42aa6a67e8f0140f1b192c4e36420079cbf9d11ac94005c69d6ae287ba310623d168517ec0162e9fc2f65b416ad2bab6e18f6445882661"

RPROVIDES:${PN} += "cachefilesd \
cachefilesd(aarch-64) \
config(cachefilesd)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
systemd"

inherit rpm

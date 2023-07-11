SUMMARY = "SSSD's Kerberos cache manager"
DESCRIPTION = "KCM is a process that stores, tracks and manages Kerberos credential \
caches."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-kcm-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "7298d29a00a9d0438ff8ba56746a61809f4be3c4e04c7ac7c43d235f4fe3807c2c045b25fe2e04a1f47009e543dc7845e0957243caf48b2f766d9224ad20467a"

RPROVIDES:${PN} += "sssd-kcm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libkrb5.so.3 \
libldb.so.2 \
libpopt.so.0 \
libselinux.so.1 \
libsss-child.so \
libsss-debug.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtevent.so.0 \
libuuid.so.1 \
sssd"

inherit rpm

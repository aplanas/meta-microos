SUMMARY = "SSSD's Kerberos cache manager"
DESCRIPTION = "KCM is a process that stores, tracks and manages Kerberos credential \
caches."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-kcm-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "c93790d244b9efb1bbc209cb339324669fcf5dfe227b6f310cba138c1e24dca22a7e4a7a5d697afcb08eca1b6459a329ba2ae225c25f491219043c911998d476"

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

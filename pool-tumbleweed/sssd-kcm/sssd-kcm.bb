SUMMARY = "SSSD's Kerberos cache manager"
DESCRIPTION = "KCM is a process that stores, tracks and manages Kerberos credential \
caches."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-kcm-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "8b1f94ac1e5a0b0e271af559bacbb38fe98b71c587e864feee07324972dde3bd344ac0fd891341cd27b1f899ae20ee178c75a0ddd6647ea779692abbb59ef4dd"

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

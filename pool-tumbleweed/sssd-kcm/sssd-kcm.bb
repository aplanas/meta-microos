SUMMARY = "SSSD's Kerberos cache manager"
DESCRIPTION = "KCM is a process that stores, tracks and manages Kerberos credential \
caches."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-kcm-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "c93790d244b9efb1bbc209cb339324669fcf5dfe227b6f310cba138c1e24dca22a7e4a7a5d697afcb08eca1b6459a329ba2ae225c25f491219043c911998d476"

RPROVIDES:${PN} += "sssd-kcm \
sssd-kcm(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdhash.so.1()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libldb.so.2()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libselinux.so.1()(64bit) \
libsss_child.so()(64bit) \
libsss_debug.so()(64bit) \
libsss_util.so()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtalloc.so.2()(64bit) \
libtevent.so.0()(64bit) \
libuuid.so.1()(64bit) \
sssd"

inherit rpm

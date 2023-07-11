SUMMARY = "The proxy backend plugin for sssd"
DESCRIPTION = "Provides the proxy back end which can be used to wrap an existing NSS \
and/or PAM modules to leverage SSSD caching."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-proxy-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "24b14fb4f250f1a269483a47f2210c690fa19a9dcefde1f3423278edb1ecbff88487b62f198febf5e5d9ef262d08fcabb0acb181719e7004a72a1bdc83e0b3b2"

RPROVIDES:${PN} += "libsss-proxy.so \
sssd-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libldb.so.2 \
libpam.so.0 \
libpopt.so.0 \
libsss-debug.so \
libsss-iface.so \
libsss-sbus.so \
libsss-util.so \
libtalloc.so.2 \
libtevent.so.0"

inherit rpm

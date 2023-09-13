SUMMARY = "The proxy backend plugin for sssd"
DESCRIPTION = "Provides the proxy back end which can be used to wrap an existing NSS \
and/or PAM modules to leverage SSSD caching."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-proxy-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "dae1df0598a369424863cccf9508f36f77b78aba447b8be18c0504774b5acfeb38aae79450c0aa59f33a389467b4b9c9da8f406bb782969ae361a5673ef63eb1"

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

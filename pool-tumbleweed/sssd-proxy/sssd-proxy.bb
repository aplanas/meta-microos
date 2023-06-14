SUMMARY = "The proxy backend plugin for sssd"
DESCRIPTION = "Provides the proxy back end which can be used to wrap an existing NSS \
and/or PAM modules to leverage SSSD caching."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-proxy-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "3ef1c93f700f0199ad3c00842babf3be07bdec056eb0c501e32430c5fcef590b705f9baf5aa92014402acad0edc7288c68931b2735fb6aca4f66f0b623338e95"

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

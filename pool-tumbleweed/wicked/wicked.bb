SUMMARY = "Network configuration infrastructure"
DESCRIPTION = "Wicked is a network configuration infrastructure incorporating a number \
of existing frameworks into a unified architecture, providing a DBUS \
interface to network configuration."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.72"

RPM_NAME = "wicked-0.6.72-2.3.aarch64.rpm"
RPM_HASH = "c0e3202d7aeac87899e44e0a25bee186b55df07198a5171c1f252931f7ee9c8e755d521bea6c179ce115f984461a479516c4a9b0848f85489646957f794c02b3"

RPROVIDES:${PN} += "config(wicked) \
libwicked-0-6 \
libwicked-0.6.72.so()(64bit) \
wicked \
wicked(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
sysconfig-netconfig \
systemd \
util-linux-systemd \
wicked-service"

inherit rpm
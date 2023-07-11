SUMMARY = "Storage-based death"
DESCRIPTION = "This package contains the storage-based death functionality."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2+20230316.5ec38cf"

RPM_NAME = "sbd-1.5.2+20230316.5ec38cf-1.1.aarch64.rpm"
RPM_HASH = "3b43bdedcc2f8b4563d3827cfc6db18cbf2d895cd80b53ac5c748c7da4cee0bb44472679756837b90fe3997a3257200aad54c88c1e7f032d795a781ba70b996b"

RPROVIDES:${PN} += "pkgconfig-sbd \
sbd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/pkg-config \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcib.so.27 \
libcmap.so.4 \
libcrmcluster.so.29 \
libcrmcommon.so.34 \
libglib-2.0.so.0 \
libpe-status.so.28 \
libqb.so.100 \
libuuid.so.1 \
libvotequorum.so.8 \
systemd"

inherit rpm

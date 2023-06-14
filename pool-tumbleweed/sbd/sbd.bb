SUMMARY = "Storage-based death"
DESCRIPTION = "This package contains the storage-based death functionality."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1+20221128.8ec8e01"

RPM_NAME = "sbd-1.5.1+20221128.8ec8e01-1.3.aarch64.rpm"
RPM_HASH = "ae07549489f759647e24afd9e731ba96750d10aadb879703cb2461f2d298eac50787ec1c7fce59c060f53ec197a717e6cf4946c887d15901e59c404cf473a7cd"

RPROVIDES:${PN} += "pkgconfig-sbd \
sbd"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/pkg-config \
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

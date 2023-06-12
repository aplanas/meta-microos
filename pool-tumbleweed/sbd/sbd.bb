SUMMARY = "Storage-based death"
DESCRIPTION = "This package contains the storage-based death functionality."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1+20221128.8ec8e01"

RPM_NAME = "sbd-1.5.1+20221128.8ec8e01-1.3.aarch64.rpm"
RPM_HASH = "ae07549489f759647e24afd9e731ba96750d10aadb879703cb2461f2d298eac50787ec1c7fce59c060f53ec197a717e6cf4946c887d15901e59c404cf473a7cd"

RPROVIDES:${PN} += "pkgconfig(sbd) \
sbd \
sbd(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/pkg-config \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcib.so.27()(64bit) \
libcmap.so.4()(64bit) \
libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) \
libcrmcluster.so.29()(64bit) \
libcrmcommon.so.34()(64bit) \
libglib-2.0.so.0()(64bit) \
libpe_status.so.28()(64bit) \
libqb.so.100()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libvotequorum.so.8()(64bit) \
libvotequorum.so.8(COROSYNC_VOTEQUORUM_1.0)(64bit) \
systemd"

inherit rpm

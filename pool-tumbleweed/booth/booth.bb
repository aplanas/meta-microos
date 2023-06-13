SUMMARY = "Ticket Manager for Multi-site Clusters"
DESCRIPTION = "Booth manages tickets which authorize cluster sites located in \
geographically dispersed locations to run resources. It \
facilitates support of geographically distributed clustering in \
Pacemaker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+20221117.9d4029a"

RPM_NAME = "booth-1.0+20221117.9d4029a-1.1.aarch64.rpm"
RPM_HASH = "77092345c393ed02489dc1142e41618dd827426a8f5bd300ccb042f3dbf8c978fb3b88ec1460ca79df7be83102e7392b0cf64403609985d29de8f2959b6af78c"

RPROVIDES:${PN} += "booth \
booth(aarch-64) \
config(booth) \
pkgconfig(booth)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libqb.so.100()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
pacemaker-ticket-support"

inherit rpm

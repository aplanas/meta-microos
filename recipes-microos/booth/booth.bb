SUMMARY = "Ticket Manager for Multi-site Clusters"
DESCRIPTION = "Booth manages tickets which authorize cluster sites located in \
geographically dispersed locations to run resources. It \
facilitates support of geographically distributed clustering in \
Pacemaker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+20220815.f40c2d5"

RPM_NAME = "booth-1.0+20220815.f40c2d5-1.3.aarch64.rpm"
RPM_HASH = "6102c6295684418a1920a10fc1fcdb6d165d621d4d27f0c384bbb6c44d7cbc17a23435bbfc587403d4d74fc4bbc31a964ed82493cbd84e99c0138709c72c1fe0"

RPROVIDES:${PN} += "booth booth(aarch-64) config(booth) pkgconfig(booth)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libglib-2.0.so.0()(64bit) libqb.so.100()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) pacemaker-ticket-support"

inherit rpm

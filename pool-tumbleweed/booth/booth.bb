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
config-booth \
pkgconfig-booth"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libqb.so.100 \
libsystemd.so.0 \
libxml2.so.2 \
libz.so.1 \
pacemaker-ticket-support"

inherit rpm

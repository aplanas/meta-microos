SUMMARY = "The fwknop Server"
DESCRIPTION = "fwknop stands for the 'FireWall KNock OPerator', and implements an authorization \
scheme called Single Packet Authorization (SPA)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "fwknopd-2.6.10-3.9.aarch64.rpm"
RPM_HASH = "a197e532491f1af5d4718fedf2afa0717839817b4df4c5d0665418dd4ec1609f0eb3a4eb4b79791f7c737c4eda405e637103cf3ca0f7188216ea347db0e8311e"

RPROVIDES:${PN} += "config-fwknopd \
fwknopd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfko.so.3 \
libpcap.so.1 \
systemd"

inherit rpm

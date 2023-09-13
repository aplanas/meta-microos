SUMMARY = "Userspace iWarp Port Mapper daemon"
DESCRIPTION = "iwpmd provides a userspace service for iWarp drivers to claim \
tcp ports through the standard socket interface."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "iwpmd-47.0-3.1.aarch64.rpm"
RPM_HASH = "b4a5b68e82b0b1eedb75d7a3d099a228904b4dd312bc367d0b1ed32840a0cb3f0e1de35312fda4d34fe380b52fd1359a4ff17d4d2a4d09a9395e132170f33170"

RPROVIDES:${PN} += "config-iwpmd \
iwpmd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libsystemd.so.0 \
rdma-core \
systemd"

inherit rpm

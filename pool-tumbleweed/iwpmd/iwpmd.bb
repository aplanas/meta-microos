SUMMARY = "Userspace iWarp Port Mapper daemon"
DESCRIPTION = "iwpmd provides a userspace service for iWarp drivers to claim \
tcp ports through the standard socket interface."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "iwpmd-45.0-1.1.aarch64.rpm"
RPM_HASH = "9c2f53b9f7e6a3d2ea2b47e18445ce6129f94b240dd22dc808dc95a08cf00c49b092ac33e0d9112e6cdc883f933a9c1e8e80b08a57d555ba50ea69c1d3f12c15"

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

SUMMARY = "Userspace iWarp Port Mapper daemon"
DESCRIPTION = "iwpmd provides a userspace service for iWarp drivers to claim \
tcp ports through the standard socket interface."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "iwpmd-47.0-2.2.aarch64.rpm"
RPM_HASH = "11ef23e4cd93597f5d9dae749a535dd5e4f99a7577096c73b758dbe98f8ca4b5f834c9db7f790112c5a49ceb3ae123619456b271c97b7175f56651d07b4cb42f"

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

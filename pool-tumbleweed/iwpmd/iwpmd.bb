SUMMARY = "Userspace iWarp Port Mapper daemon"
DESCRIPTION = "iwpmd provides a userspace service for iWarp drivers to claim \
tcp ports through the standard socket interface."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "iwpmd-45.0-1.2.aarch64.rpm"
RPM_HASH = "d42f60b2b9b2197371928bd2ef580d5798596b61e317fef85a9dda5c1bc6365b463aec5171bf7c98465a38a942791e564cf54e4b49899b7c01d7bf9b4e73a1ee"

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

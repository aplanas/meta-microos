SUMMARY = "Userspace iWarp Port Mapper daemon"
DESCRIPTION = "iwpmd provides a userspace service for iWarp drivers to claim \
tcp ports through the standard socket interface."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "iwpmd-47.0-1.1.aarch64.rpm"
RPM_HASH = "4bbc4c22767304ebafc94b37a3c321eb2057b0364eaaae65b304f080ead78791b223f72c181878ed387ac04bc5be6ec7e7b36e23b0ca2c94635bf9d38493b0c3"

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

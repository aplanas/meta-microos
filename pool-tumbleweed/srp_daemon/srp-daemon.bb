SUMMARY = "Tools for using the InfiniBand SRP protocol devices"
DESCRIPTION = "In conjunction with the kernel ib_srp driver, srp_daemon allows you to \
discover and use SCSI devices via the SCSI RDMA Protocol over InfiniBand."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "srp_daemon-47.0-1.1.aarch64.rpm"
RPM_HASH = "3c4e584973ce70b67ef5f919f640a2a7d7d235e061632c7ff7c8d640520e615c25b8c015eeef18535beec2e5cdc9f3c5d6a77bdeda7bcbbf5ce1b1b4f4735b79"

RPROVIDES:${PN} += "config-srp-daemon \
srp-daemon \
srptools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3 \
libibverbs.so.1 \
rdma-core \
systemd"

inherit rpm

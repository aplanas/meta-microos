SUMMARY = "Tools for using the InfiniBand SRP protocol devices"
DESCRIPTION = "In conjunction with the kernel ib_srp driver, srp_daemon allows you to \
discover and use SCSI devices via the SCSI RDMA Protocol over InfiniBand."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "srp_daemon-45.0-1.1.aarch64.rpm"
RPM_HASH = "ecc0073364c163e6697e0b9888a152dcdb700e7ddf4acb1c32c2fd6d56b1cda5a5e6aab9d6649a66be6d0cfcc57da2af8c45c0654e745b6d873f09d151639b0f"

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

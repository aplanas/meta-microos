SUMMARY = "Tools for using the InfiniBand SRP protocol devices"
DESCRIPTION = "In conjunction with the kernel ib_srp driver, srp_daemon allows you to \
discover and use SCSI devices via the SCSI RDMA Protocol over InfiniBand."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "srp_daemon-47.0-2.2.aarch64.rpm"
RPM_HASH = "76cea9b70f3ce9554836160a595b2890a3371321dfcdef29d86e7b687de64d36da3aadb10e1c86592c59d58256ec242aab67f62a3679ea2097362637ac3354a2"

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

SUMMARY = "Tools for using the InfiniBand SRP protocol devices"
DESCRIPTION = "In conjunction with the kernel ib_srp driver, srp_daemon allows you to \
discover and use SCSI devices via the SCSI RDMA Protocol over InfiniBand."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "srp_daemon-47.0-3.1.aarch64.rpm"
RPM_HASH = "d9a4dcd54bfeabaf125de383e3b1a9215db96365e41f60a139166d9be733fbb2f526c13e5c5e6d2698d595d80faa11777bdbe812f4a4fd5adc6e6ba007e585c0"

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

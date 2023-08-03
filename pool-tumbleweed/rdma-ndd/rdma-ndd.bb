SUMMARY = "Daemon to manage RDMA Node Description"
DESCRIPTION = "rdma-ndd is a system daemon which watches for rdma device changes and/or \
hostname changes and updates the Node Description of the rdma devices based \
on those changes."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-ndd-47.0-1.1.aarch64.rpm"
RPM_HASH = "741c456d9a67a3961d0f28ffce99e604dd214d00f39f25b5574e42205d9c61869e91b0ad828f39408d27695ca4dcb2d4772afb9bb54e11c3057d046c3a29e36a"

RPROVIDES:${PN} += "rdma-ndd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libudev.so.1 \
rdma-core \
systemd"

inherit rpm

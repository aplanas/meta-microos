SUMMARY = "Daemon to manage RDMA Node Description"
DESCRIPTION = "rdma-ndd is a system daemon which watches for rdma device changes and/or \
hostname changes and updates the Node Description of the rdma devices based \
on those changes."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-ndd-47.0-3.1.aarch64.rpm"
RPM_HASH = "7b3b504623aa804c50d4c07e68f6a284218413ac1679adbe6981aac631a2f2a47ca7e62d2fec1ca73da78f3ca6bd9e981bad88e08d73d5dc562325eb448e71d8"

RPROVIDES:${PN} += "rdma-ndd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libudev.so.1 \
rdma-core \
systemd"

inherit rpm

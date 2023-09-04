SUMMARY = "Daemon to manage RDMA Node Description"
DESCRIPTION = "rdma-ndd is a system daemon which watches for rdma device changes and/or \
hostname changes and updates the Node Description of the rdma devices based \
on those changes."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-ndd-47.0-2.2.aarch64.rpm"
RPM_HASH = "8ee1ae8c90d72227006a52fffd572073d76b883ce9073abcc1679ab9d91fad9ad0e1215a28d8cfeb4fc3694b3eeecc8ccc4740dd230be094607ac4af0c1ae07b"

RPROVIDES:${PN} += "rdma-ndd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libudev.so.1 \
rdma-core \
systemd"

inherit rpm

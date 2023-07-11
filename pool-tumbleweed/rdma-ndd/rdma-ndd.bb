SUMMARY = "Daemon to manage RDMA Node Description"
DESCRIPTION = "rdma-ndd is a system daemon which watches for rdma device changes and/or \
hostname changes and updates the Node Description of the rdma devices based \
on those changes."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rdma-ndd-45.0-1.2.aarch64.rpm"
RPM_HASH = "4f00f5abace4613315d1f1bc76afc93f6ec0ec2df589097cf9321762f6583ba8d11540ec91a4b452e68c2ca05dc4c1cb00a17445fc59ea7517d178d930067bc9"

RPROVIDES:${PN} += "rdma-ndd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libudev.so.1 \
rdma-core \
systemd"

inherit rpm

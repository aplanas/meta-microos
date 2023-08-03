SUMMARY = "RDMA core userspace libraries and daemons"
DESCRIPTION = "RDMA core userspace infrastructure and documentation, including initialization \
scripts, kernel driver-specific modprobe override configs, IPoIB network \
scripts, dracut rules, and the rdma-ndd utility."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-core-47.0-1.1.aarch64.rpm"
RPM_HASH = "6e25af92fd38f844d88ffdace6da9de7dd822cf7fb9b160e36832a83f83e6e19fe4063aa0be972e22dda23490e0643b71eadb89e2f1a7f054639699b6452367e"

RPROVIDES:${PN} += "config-rdma-core \
ofed \
rdma \
rdma-core"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
kmod \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
systemd \
udev"

inherit rpm

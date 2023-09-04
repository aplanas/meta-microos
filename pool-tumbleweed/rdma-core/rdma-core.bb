SUMMARY = "RDMA core userspace libraries and daemons"
DESCRIPTION = "RDMA core userspace infrastructure and documentation, including initialization \
scripts, kernel driver-specific modprobe override configs, IPoIB network \
scripts, dracut rules, and the rdma-ndd utility."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-core-47.0-2.2.aarch64.rpm"
RPM_HASH = "f60cbf8d11a40328c57ffd77153feabf731ad8a464bc64740797955f51fa1060a9a04bd2c58c7d7d51eaa165ccd28594ecbfec5a81396228d419c443f0debaec"

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

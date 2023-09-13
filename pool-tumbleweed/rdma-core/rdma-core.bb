SUMMARY = "RDMA core userspace libraries and daemons"
DESCRIPTION = "RDMA core userspace infrastructure and documentation, including initialization \
scripts, kernel driver-specific modprobe override configs, IPoIB network \
scripts, dracut rules, and the rdma-ndd utility."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-core-47.0-3.1.aarch64.rpm"
RPM_HASH = "76656e262753f0876e52d1cf11cc1f2e7753db8aecdf44e0ee28c91f9d982777f71d23f584d8827e19ed44ed12e982f39dfff38edeee62e36562ee0ab436337d"

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

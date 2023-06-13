SUMMARY = "RDMA core userspace libraries and daemons"
DESCRIPTION = "RDMA core userspace infrastructure and documentation, including initialization \
scripts, kernel driver-specific modprobe override configs, IPoIB network \
scripts, dracut rules, and the rdma-ndd utility."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rdma-core-45.0-1.1.aarch64.rpm"
RPM_HASH = "fed2e3fad95bac8dbdb77c2be5f2bc89f0fe8ea2f8b64360a0077ad31cab0016278943abc601c81c4f44cbc53c370fb2180e366e4829ae19911eb5e9a702df48"

RPROVIDES:${PN} += "config(rdma-core) \
ofed \
rdma \
rdma-core \
rdma-core(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
kmod \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
systemd \
udev"

inherit rpm

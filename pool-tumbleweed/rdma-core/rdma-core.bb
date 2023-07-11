SUMMARY = "RDMA core userspace libraries and daemons"
DESCRIPTION = "RDMA core userspace infrastructure and documentation, including initialization \
scripts, kernel driver-specific modprobe override configs, IPoIB network \
scripts, dracut rules, and the rdma-ndd utility."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rdma-core-45.0-1.2.aarch64.rpm"
RPM_HASH = "7cd9088241b859a57c7f543c44a4a054f7ddc61f521727bd73791cc65654373d557d1737f2a37b7b7684bf572a3c43d0fec2882c1fd8c048626d1a4aab965f51"

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

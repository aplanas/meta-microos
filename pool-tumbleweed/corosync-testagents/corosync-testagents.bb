SUMMARY = "The Corosync Cluster Engine Test Agents"
DESCRIPTION = "This package contains corosync test agents."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-testagents-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "505e687a4492f8992ebe2b42a0ee5fe6191bd66e5ceebb21400a90ef1599a431f720192df557438cebefcf2badd14e1d54daf3c84390cb31b294ddb73fed6751"

RPROVIDES:${PN} += "corosync-testagents \
corosync-testagents(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
corosync \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcfg.so.6()(64bit) \
libcmap.so.4()(64bit) \
libcorosync_common.so.4()(64bit) \
libcpg.so.4()(64bit) \
libnss3.so()(64bit) \
libqb.so.100()(64bit) \
libquorum.so.5()(64bit) \
libsam.so.4()(64bit) \
libvotequorum.so.8()(64bit)"

inherit rpm

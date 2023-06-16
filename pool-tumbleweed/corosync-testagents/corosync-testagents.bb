SUMMARY = "The Corosync Cluster Engine Test Agents"
DESCRIPTION = "This package contains corosync test agents."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-testagents-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "505e687a4492f8992ebe2b42a0ee5fe6191bd66e5ceebb21400a90ef1599a431f720192df557438cebefcf2badd14e1d54daf3c84390cb31b294ddb73fed6751"

RPROVIDES:${PN} += "corosync-testagents"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
corosync \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfg.so.6 \
libcmap.so.4 \
libcorosync-common.so.4 \
libcpg.so.4 \
libnss3.so \
libqb.so.100 \
libquorum.so.5 \
libsam.so.4 \
libvotequorum.so.8"

inherit rpm

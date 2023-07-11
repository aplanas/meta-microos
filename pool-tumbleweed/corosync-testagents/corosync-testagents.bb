SUMMARY = "The Corosync Cluster Engine Test Agents"
DESCRIPTION = "This package contains corosync test agents."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-testagents-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "32c117d67d27012811915be00dc4ebedc9c24cafc5fcc780c61246d7d6cb8545c638a1c185121332ed134f34ffbf75e97502f58a02477a61c5cd7baccd879ee4"

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

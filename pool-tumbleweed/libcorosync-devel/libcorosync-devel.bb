SUMMARY = "The Corosync Cluster Engine Development Kit"
DESCRIPTION = "This package contains include files and man pages used to develop using \
The Corosync Cluster Engine APIs."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcorosync-devel-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "4fbb4cd23ba2c8dcd39303f3b5795ddbae18cd51cd277707695cc025ee01f8bc163f67cdde7316561ba55a344f6708dcdc4ad158b9015f671253018d4abf76ce"

RPROVIDES:${PN} += "corosync-devel \
libcorosync-devel \
libcorosync-devel(aarch-64) \
pkgconfig(corosync) \
pkgconfig(libcfg) \
pkgconfig(libcmap) \
pkgconfig(libcorosync_common) \
pkgconfig(libcpg) \
pkgconfig(libquorum) \
pkgconfig(libsam) \
pkgconfig(libtotem_pg) \
pkgconfig(libvotequorum)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
libcfg6 \
libcmap4 \
libcorosync_common4 \
libcpg4 \
libqb-devel \
libquorum5 \
libsam4 \
libtotem_pg5 \
libvotequorum8 \
pkgconfig \
pkgconfig(libqb)"

inherit rpm

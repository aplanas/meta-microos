SUMMARY = "The Corosync Cluster Engine Development Kit"
DESCRIPTION = "This package contains include files and man pages used to develop using \
The Corosync Cluster Engine APIs."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcorosync-devel-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "15b7ff85325be7760dc9decd398498196a46b3e54d991b0d697013076d26d65bbedb537ff40b9fd9ec233ef32eda7e55d903fefe05df1bc659411ca783f56844"

RPROVIDES:${PN} += "corosync-devel \
libcorosync-devel \
pkgconfig-corosync \
pkgconfig-libcfg \
pkgconfig-libcmap \
pkgconfig-libcorosync-common \
pkgconfig-libcpg \
pkgconfig-libquorum \
pkgconfig-libsam \
pkgconfig-libtotem-pg \
pkgconfig-libvotequorum"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
libcfg6 \
libcmap4 \
libcorosync-common4 \
libcpg4 \
libqb-devel \
libquorum5 \
libsam4 \
libtotem-pg5 \
libvotequorum8 \
pkgconfig \
pkgconfig-libqb"

inherit rpm

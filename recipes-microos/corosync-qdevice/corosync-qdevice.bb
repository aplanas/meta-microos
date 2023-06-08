SUMMARY = "The Corosync Cluster Engine Qdevice"
DESCRIPTION = "This package contains the Corosync Cluster Engine Qdevice, script for creating \
NSS certificates and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-qdevice-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "08757bc65bbd6e563b193ae2d411eb3ddd61d3fcaaabc13acf6ad3219ee1317cd0ff7839b30b33e8b66ae0e27cbe548daf3ae4d07b822821bbd26014b85d7d6b"

RPROVIDES:${PN} += "config(corosync-qdevice) corosync-qdevice corosync-qdevice(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash corosync ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcmap.so.4()(64bit) libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) libcorosync_common.so.4()(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.2)(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.2)(64bit) libvotequorum.so.8()(64bit) libvotequorum.so.8(COROSYNC_VOTEQUORUM_1.0)(64bit) mozilla-nss-tools"

inherit rpm

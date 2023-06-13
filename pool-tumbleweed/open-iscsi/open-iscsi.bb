SUMMARY = "Linux iSCSI Software Initiator"
DESCRIPTION = "This is a transport independent implementation of RFC 3720 \
iSCSI. It is partitioned into user and kernel parts. \
 \
The kernel portion of Open-iSCSI implements the iSCSI data path (that \
is, iSCSI Read and iSCSI Write), and consists of two loadable \
modules: iscsi_if.ko and iscsi_tcp.ko, and is now is delivered \
as part of the kernel. \
 \
The user-space part contains the entire control plane: configuration \
manager, iSCSI Discovery, Login and Logout processing, \
connection-level error processing, Nop-In and Nop-Out handling. It \
comes with a daemon process called iscsid, and a management utility, \
iscsiadm."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.8"

RPM_NAME = "open-iscsi-2.1.8-99.1.aarch64.rpm"
RPM_HASH = "8d99580b3ce9f58829f621ed76e3bd3caa9304c1aba04c3a739e3bc567162bdd439a5c6307f662bcf86010b5ac244e5f66c8d5aa8aa51115ed1768cc1da9d030"

RPROVIDES:${PN} += "config(open-iscsi) \
open-iscsi \
open-iscsi(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libisns.so.0()(64bit) \
libisns.so.0(LIBISNS_0.96)(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2.19)(64bit) \
libmount.so.1(MOUNT_2.22)(64bit) \
libopeniscsiusr.so.0()(64bit) \
libopeniscsiusr0 \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
systemd"

inherit rpm

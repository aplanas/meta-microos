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

PV = "2.1.9"

RPM_NAME = "open-iscsi-2.1.9-101.1.aarch64.rpm"
RPM_HASH = "dad98a27773c03d534a5991da302534a7c1bb395d3ac19befc00a407a211701587152b11dcabf95bdff87319ce59777016ec5fff978ed1bd8122166d7d80c5eb"

RPROVIDES:${PN} += "config-open-iscsi \
open-iscsi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libisns.so.0 \
libkmod.so.2 \
libmount.so.1 \
libopeniscsiusr.so.0 \
libopeniscsiusr0 \
libsystemd.so.0 \
systemd"

inherit rpm

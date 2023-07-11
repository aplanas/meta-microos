SUMMARY = "Support Utilities for Kernel nfsd"
DESCRIPTION = "This package contains support for the kernel based NFS server. You can \
tune the number of server threads via the sysconfig variable \
USE_KERNEL_NFSD_NUMBER. For quota over NFS support, install the quota \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.3"

RPM_NAME = "nfs-kernel-server-2.6.3-39.2.aarch64.rpm"
RPM_HASH = "f2016a4b6197cb4a479753f5027a9598a12743b976df6004ccfb2334042aa8b90f6002fd22421af72f8f7efcde8404eddc370b1d178588eca465da3d713fe41f"

RPROVIDES:${PN} += "config-nfs-kernel-server \
nfs-kernel-server \
nfs-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libnss-usrfiles2 \
libsqlite3.so.0 \
libtirpc.so.3 \
libuuid.so.1 \
netcfg \
nfs-client \
permissions \
rpcbind"

inherit rpm

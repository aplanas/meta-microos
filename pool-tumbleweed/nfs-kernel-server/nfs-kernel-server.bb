SUMMARY = "Support Utilities for Kernel nfsd"
DESCRIPTION = "This package contains support for the kernel based NFS server. You can \
tune the number of server threads via the sysconfig variable \
USE_KERNEL_NFSD_NUMBER. For quota over NFS support, install the quota \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.3"

RPM_NAME = "nfs-kernel-server-2.6.3-39.1.aarch64.rpm"
RPM_HASH = "b7b5b9ba6035d8b33cad3fd0af3a35b511c387d74fa4afa25d955bdbb0f7323fc39a833044123e80c6ebffae8344d73a6cbf7c2a751fd0b12ed8814b25d91a6d"

RPROVIDES:${PN} += "config(nfs-kernel-server) \
nfs-kernel-server \
nfs-kernel-server(aarch-64) \
nfs-utils"

RDEPENDS:${PN} += "(kmod(nfsd.ko) if kernel) \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libnss_usrfiles2 \
libsqlite3.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libuuid.so.1(UUID_2.31)(64bit) \
netcfg \
nfs-client \
permissions \
rpcbind"

inherit rpm

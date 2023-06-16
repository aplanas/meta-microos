SUMMARY = "An NFS server running in user space"
DESCRIPTION = "NFS-Ganesha is an NFS server running in userspace. It comes with various \
back-end modules (called File System Abstraction Layers - FSALs) for different \
file systems and name-spaces (notably the Ceph 'file' and 'object' back-ends - \
CephFS and RGW, respectively)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "7e518611d2697c9a620e07914aa2563d5b26539d0fbfcdc9389bceb18870afabd0f0a16337405b3da6f90b37e6d11fbd15a8bbf2f7137bd4f86f949bf13a6e96"

RPROVIDES:${PN} += "config-nfs-ganesha \
nfs-ganesha"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dbus-1 \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
nfs-utils \
procps \
rpcbind"

inherit rpm

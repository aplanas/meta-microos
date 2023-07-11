SUMMARY = "An NFS server running in user space"
DESCRIPTION = "NFS-Ganesha is an NFS server running in userspace. It comes with various \
back-end modules (called File System Abstraction Layers - FSALs) for different \
file systems and name-spaces (notably the Ceph 'file' and 'object' back-ends - \
CephFS and RGW, respectively)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "3bce40cd3c8f12428086949438b636eba6ba4810e2cbfc765584255f665836670779974ee1fe8c1d81ab403cc22f1a738f0187b4bccda330ce4d8f70dddba35a"

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

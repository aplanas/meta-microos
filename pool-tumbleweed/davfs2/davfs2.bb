SUMMARY = "FUSE-Filesystem to access WebDAV servers"
DESCRIPTION = "davfs2 is a FUSE file system driver that allows mounting a WebDAV server \
as a local file system, like a disk drive. This way, applications can access \
resources on a Web server without knowing anything about HTTP or WebDAV. \
 \
davfs2 runs as a daemon in userspace. It uses the kernel file system 'coda', or \
FUSE. To connect to the WebDAV server, it makes use of the neon library, \
supporting TLS/SSL and access via proxy servers."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "davfs2-1.7.0-2.2.aarch64.rpm"
RPM_HASH = "5ce2ebaef326a4ef09e7996097984a75bf919abc26d8c857622bd5eb74336604382824e849e0379b84464d492caa717d3af2c0ee88fe841c7d37685d32c3d98d"

RPROVIDES:${PN} += "config(davfs2) \
davfs2 \
davfs2(aarch-64) \
fuse-davfs2"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libneon.so.27()(64bit)"

inherit rpm

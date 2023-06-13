SUMMARY = "Filesystem client based on SSH file transfer protocol"
DESCRIPTION = "SSHFS is a filesystem client based on the SSH File Transfer Protocol. \
Since most SSH servers already support this protocol it is very easy to \
set up: i.e. on the server side there's nothing to do.	On the client \
side mounting the filesystem is as easy as logging into the server with \
openssh (ssh)."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.3"

RPM_NAME = "sshfs-3.7.3-1.4.aarch64.rpm"
RPM_HASH = "78ff3283814664659f2c0aa7e13f3577e9e4f2cb000ee9556e42a5ddf693b1d3a52b392e8bd6af1e7db8fe593e85537ba3df9e5fcd3996396aa32af2abfb7f74"

RPROVIDES:${PN} += "sshfs \
sshfs(aarch-64)"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse3.so.3()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm

SUMMARY = "Filesystem client based on SSH file transfer protocol"
DESCRIPTION = "SSHFS is a filesystem client based on the SSH File Transfer Protocol. \
Since most SSH servers already support this protocol it is very easy to \
set up: i.e. on the server side there's nothing to do.	On the client \
side mounting the filesystem is as easy as logging into the server with \
openssh (ssh)."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.3"

RPM_NAME = "sshfs-3.7.3-1.5.aarch64.rpm"
RPM_HASH = "27afd851edb41dea74c9ba1114d8ff33d7f7c621a0466385ebbe84e8d901ff81e27d0f3f6f4686d3701a86fa49b0a54fc69b8e1b91441a744ea59d5dea12e18a"

RPROVIDES:${PN} += "sshfs"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
libglib-2.0.so.0"

inherit rpm

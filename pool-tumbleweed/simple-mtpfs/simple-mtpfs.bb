SUMMARY = "Simple MTP fuse filesystem driver"
DESCRIPTION = "SIMPLE-MTPFS (Simple Media Transfer Protocol FileSystem) is a file system for \
Linux (and other operating systems with a FUSE implementation, such as Mac OS X \
or FreeBSD) capable of operating on files on MTP devices attached via USB to \
local machine. On the local computer where the SIMPLE-MTPFS is mounted, the \
implementation makes use of the FUSE (Filesystem in Userspace) kernel module. \
The practical effect of this is that the end user can seamlessly interact with \
MTP device files."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "simple-mtpfs-0.4.0-2.2.aarch64.rpm"
RPM_HASH = "814fc2121ec82e155a3a161aaf37f5137f4c78a2dfc6c5b5132d82010925affd32a6f6c7136cee35c2a622d1eca7072389df00033162b73cf461c5261bd45b98"

RPROVIDES:${PN} += "simple-mtpfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libmtp.so.9 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm

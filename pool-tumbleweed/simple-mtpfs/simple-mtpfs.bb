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

RPM_NAME = "simple-mtpfs-0.4.0-2.3.aarch64.rpm"
RPM_HASH = "29c17154ea6c26ccf88682e5131c04926c46353e16489a7bf39752e2f1061e115c6c9b6e720b734e08b8025f3ad28a13ce8ca992162bbf72fab8142d93d49bc5"

RPROVIDES:${PN} += "simple-mtpfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libmtp.so.9 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm

SUMMARY = "Utility for ext2,ext3,ext4 filesystems that zeroes out unallocated blocks"
DESCRIPTION = "zerofree is a utility for ext2,ext3 and ext4 filesystems that \
will scan the list of free blocks in a filesystem and fill with \
zeroes any blocks that do not already contain zeroes. \
 \
This RPM also includes the sparsify utility, which will scan all \
files in a filesystem and ensure that they are maximally sparse."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "zerofree-1.1.1-1.21.aarch64.rpm"
RPM_HASH = "0e2866abfc0b62160b69f24780b15306148789fdbdfa82241814cca44a1066c558155b7e628f81b2ba0aee1c475f317a56f3535476ca43c13fecbc5ab16f5ab7"

RPROVIDES:${PN} += "zerofree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libext2fs.so.2"

inherit rpm

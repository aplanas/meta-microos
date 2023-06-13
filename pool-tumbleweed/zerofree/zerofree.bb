SUMMARY = "Utility for ext2,ext3,ext4 filesystems that zeroes out unallocated blocks"
DESCRIPTION = "zerofree is a utility for ext2,ext3 and ext4 filesystems that \
will scan the list of free blocks in a filesystem and fill with \
zeroes any blocks that do not already contain zeroes. \
 \
This RPM also includes the sparsify utility, which will scan all \
files in a filesystem and ensure that they are maximally sparse."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "zerofree-1.1.1-1.20.aarch64.rpm"
RPM_HASH = "aad57a7e29cd9bc4e18b65faca4fdfdc4c2bc80572c575c01456eb790a11fc080161a02ba648912e3a757355b88df5050900d7e5e946f2cc6af3a7969ce7aa73"

RPROVIDES:${PN} += "zerofree \
zerofree(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libext2fs.so.2()(64bit)"

inherit rpm

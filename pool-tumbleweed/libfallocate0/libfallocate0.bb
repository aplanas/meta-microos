SUMMARY = "Filesystem preallocation interface library"
DESCRIPTION = "libfallocate provides an interface for applications to tell filesystems \
about the size of to-be-written files, so the filesystem can do a better \
job in taking allocation decisions to avoid fragmentation. \
 \
libfallocate provides a wrapper for the fallocate() syscall in case your \
glibc (<2.10) does not have it yet. It also provides linux_fallocate() \
which will attempt the space reservation ioctl that xfs and ocfs2 \
provide in case fallocate() did not succeed. \
 \
It has an additional richer interface fallocate_with_fallback() that \
allows you to instruct it to fallback to do preallocation by zeroing \
things out (like posix_fallocate()) or to extend the file size by a sparse \
write (like a successful fallocate() with mode==0 would have done)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfallocate0-0.1.1-17.16.aarch64.rpm"
RPM_HASH = "ab1efc4b7f231463cfeb2c6ac1d0233c21da3a62dd9a3d789835ba9b2b40089dc8987b8ae169c94ffff21f264d9f0789b261ba07e61fbe83d779c82481d0d540"

RPROVIDES:${PN} += "libfallocate.so.0 \
libfallocate0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

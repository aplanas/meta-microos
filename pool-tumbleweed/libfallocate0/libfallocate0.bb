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

RPM_NAME = "libfallocate0-0.1.1-17.15.aarch64.rpm"
RPM_HASH = "66dc3047ca8f0317bd9ad0bfc3c2b34bec840a828775eeeee8fa2dbdddb45ad6989dfc01bc42f644e9218ea0f4e7e8b36184656b52ddeac983b64d42ecc2d331"

RPROVIDES:${PN} += "libfallocate.so.0()(64bit) \
libfallocate0 \
libfallocate0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

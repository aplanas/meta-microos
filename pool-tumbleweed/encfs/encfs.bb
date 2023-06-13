SUMMARY = "Userspace Encrypted File System"
DESCRIPTION = "EncFS provides an encrypted file system, layered on top of a normal \
directory tree and encrypts individual files which are stored in the \
hosting directory tree. \
 \
This has several advantages over the loopback encryption which \
provided by the Linux kernel: \
- No space is and has to be reserved, encrypted files only \
  take the space that they really occupy \
- Backups: encrypted files can be individually backed-up on the host \
  filesystem \
- Layering: Since it's hosted on a normal filesystem, encfs can be \
  used on filesystems which normally have no support encryption, \
  like NFS or other userspace filesystems. \
 \
EncFS is implemented as a userspace filesystem in an unprivileged \
application using fuse (FUSE (Filesystem in USErspace))."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.9.5"

RPM_NAME = "encfs-1.9.5-2.16.aarch64.rpm"
RPM_HASH = "c8df014214939e39f760d7093c9dcab0241a3ad75a81408a23cfbb3ccfd514f13527e74f8c67da4811245a52d3e14f194b38d48b00b4d2125c79894aa0a77198"

RPROVIDES:${PN} += "encfs \
encfs(aarch-64) \
libencfs.so.1.9()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
fuse \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libfuse.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtinyxml2.so.9()(64bit)"

inherit rpm

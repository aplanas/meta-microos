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

RPM_NAME = "encfs-1.9.5-2.17.aarch64.rpm"
RPM_HASH = "8737d799a55c34127be957d7a6f89cb50fe734d2034c4ca0efe338ebeebf2097eaeab41303dca480fe452ba38cbc76a3abaca1e80e2ba9527bcac7dc0037b38f"

RPROVIDES:${PN} += "encfs \
libencfs.so.1.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libtinyxml2.so.9"

inherit rpm

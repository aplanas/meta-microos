SUMMARY = "Convenient and transparent local/remote incremental mirror/backup"
DESCRIPTION = "rdiff-backup backs up one directory to another, possibly over a \
network. The target directory ends up a copy of the source directory, \
but extra reverse diffs are stored in a special subdirectory of that \
target directory, so you can still recover files lost some time ago. \
The idea is to combine the best features of a mirror and an incremental \
backup. rdiff-backup also preserves subdirectories, hard links, dev \
files, permissions, uid/gid ownership, and modification times. Also, \
rdiff-backup can operate in a bandwidth efficient manner over a pipe, \
like rsync. Thus you can use rdiff-backup and ssh to securely back a \
hard drive up to a remote location, and only the differences will be \
transmitted. Finally, rdiff-backup is easy to use and settings have \
sensical defaults."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.4"

RPM_NAME = "rdiff-backup-2.2.4-2.2.aarch64.rpm"
RPM_HASH = "d5015b94d0f97935b57517c0fa30c1fe03d1a090de279708d4f18fddf2090ba5cc3b8817fd004176ab2ea4767f012a7bc6a1824ccf7cd02b5a28edefcd9034eb"

RPROVIDES:${PN} += "python3.11dist-rdiff-backup \
python3dist-rdiff-backup \
rdiff-backup"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
librsync.so.2 \
python-abi \
python3-PyYAML \
python3-pylibacl \
python3-xattr"

inherit rpm

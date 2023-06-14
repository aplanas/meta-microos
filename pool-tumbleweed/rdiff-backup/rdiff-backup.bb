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

RPM_NAME = "rdiff-backup-2.2.4-2.1.aarch64.rpm"
RPM_HASH = "cc0f94b16001896dfd09f8f69191a74dc4149776d0bcb6b2f608daa274cf47c2bcaf0acfa2cc2d04fb3409aea0b0776ded186fe5d69cc341ee6c4bb4eb5140fa"

RPROVIDES:${PN} += "python3.10dist-rdiff-backup \
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

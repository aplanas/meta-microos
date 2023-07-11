SUMMARY = "Recovery tool for ext4 and ext3 filesystems"
DESCRIPTION = "extundelete is a utility that can recover deleted files from an ext3 or ext4 \
partition. extundelete uses the information stored in the partition's journal \
to attempt to recover a file that has been deleted from the partition. There is \
no guarantee that any particular file will be able to be undeleted, so always \
try to have a good backup system in place, or at least put one in place after \
recovering your files!"
LICENSE = "GPL-2.0-only"

PV = "0.2.4"

RPM_NAME = "extundelete-0.2.4-2.20.aarch64.rpm"
RPM_HASH = "0d9edb1a8c803f8411433b0918905a4fb99ff8d0dd5f13a8ec7475bdd0621d74c2e466e7de49d4dab3b03d04f2b4a71a220612e52208127e082830950e9c44e8"

RPROVIDES:${PN} += "extundelete"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libext2fs.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

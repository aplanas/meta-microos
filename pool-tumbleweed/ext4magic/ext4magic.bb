SUMMARY = "Tool for recovering deleted files on ext3/4 filesystems"
DESCRIPTION = "ext4magic is a tool which can help recover accidentally deleted or \
overwritten files from ext3 or ext4 file systems. Especially private \
computers may lack an adequate, frequent or reliable backup."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2"

RPM_NAME = "ext4magic-0.3.2-4.17.aarch64.rpm"
RPM_HASH = "4f4d8293a5925c634bed60df97f406c10773e10448b225a9df3aea05d1c0e58a4a709be0737034b6016e4e30199c479f922a5ae4722ace1413b1730903f38fe2"

RPROVIDES:${PN} += "ext4magic \
ext4magic(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libe2p.so.2()(64bit) \
libext2fs.so.2()(64bit) \
libmagic.so.1()(64bit) \
libuuid.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm

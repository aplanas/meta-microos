SUMMARY = "Tools Used for the Macintosh's Hierarchical File System"
DESCRIPTION = "HFS is the Hierarchical File System used on modern Macintosh computers. \
With this package, you can read and write Macintosh-formatted media, \
such as floppy disks, CD-ROMs, and SCSI hard disks on most UNIX \
platforms. You can also format raw media into an HFS volume."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "hfsutils-3.2.6-1245.13.aarch64.rpm"
RPM_HASH = "eb6de48f24f6715137e3b8386d8ea1ae07be791eccdeac65b505dad43a4509f5e90af3dc20b527ae90e29b28cc7b69bff74335895a723741f182642544a146e5"

RPROVIDES:${PN} += "hfsutils \
hfsutils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

SUMMARY = "Tool That Can Guess a Lost Partition Table"
DESCRIPTION = "Gpart is a small tool that tries to guess what partitions are on a PC \
type hard disk in case the primary partition table was damaged. Gpart \
supports, among others, partitions formatted as ext2, FAT 12/16/32, \
ReiserFS, NTFS, and HPFS. Read the file \
/usr/share/doc/packages/gpart/README and the gpart man page before \
using gpart."
LICENSE = "GPL-2.0+"

PV = "0.3"

RPM_NAME = "gpart-0.3-1.24.aarch64.rpm"
RPM_HASH = "b2158a19fce56e4651ea180be047a70293f2511ab2dcb7cfb7e954689a1a83e0f1921c480da748c4ee39877d04a428755f0958f33cc3f97ba135f5af53ba2d34"

RPROVIDES:${PN} += "gpart \
gpart(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

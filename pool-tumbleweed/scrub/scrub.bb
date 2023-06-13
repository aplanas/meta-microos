SUMMARY = "Disk scrubbing program"
DESCRIPTION = "Scrub writes patterns on files or disk devices to make \
retrieving the data more difficult.  It operates in one of three modes: \
1) the special file corresponding to an entire disk is scrubbed \
   and all data on it is destroyed. \
2) a regular file is scrubbed and only the data in the file \
   (and optionally its name in the directory entry) is destroyed. \
3) a regular file is created, expanded until \
   the file system is full, then scrubbed as in 2)."
LICENSE = "GPL-2.0"

PV = "2.6.1"

RPM_NAME = "scrub-2.6.1-1.27.aarch64.rpm"
RPM_HASH = "ae9dcf1edda4a878184a5441dd7ca1e8d8a095d7eab8dd660276b8f99ed7553ded774dc8d8b5d0d6b121969566a91fbab6457d253aeb9bb844ae263997a6c02d"

RPROVIDES:${PN} += "scrub \
scrub(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

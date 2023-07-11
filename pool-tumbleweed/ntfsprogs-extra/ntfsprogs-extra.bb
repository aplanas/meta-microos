SUMMARY = "NTFS Utilities which can damage your filesystem such that Windows can't read it"
DESCRIPTION = "These are programs which are considered non-functional or only test-oriented.  They are kept in the source \
tarball so that volunteers can capitalize on them for improvement. \
 \
In particular ntfsck is just a place holder.  Distributions are expected not to recommend inserting a positive value in the last field of /etc/fstab for ntfs partitions. \
 \
They have been orphaned for ten years and are unlikely to be upgraded (except ntfsfallocate, if there is some demand)."
LICENSE = "GPL-2.0-or-later"

PV = "2022.10.3"

RPM_NAME = "ntfsprogs-extra-2022.10.3-2.5.aarch64.rpm"
RPM_HASH = "2feab7ac4473e6a9b04823e611596a98918c323e08b0adbd5219c6b43a48a34771477e20b0ecd1e96a2f2b4bb19bfcc7ea1ffbb5b6a0013f94bccdf3eb1bef25"

RPROVIDES:${PN} += "ntfsprogs-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libntfs-3g.so.89"

inherit rpm

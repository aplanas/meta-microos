SUMMARY = "NTFS Utilities which can damage your filesystem such that Windows can't read it"
DESCRIPTION = "These are programs which are considered non-functional or only test-oriented.  They are kept in the source \
tarball so that volunteers can capitalize on them for improvement. \
 \
In particular ntfsck is just a place holder.  Distributions are expected not to recommend inserting a positive value in the last field of /etc/fstab for ntfs partitions. \
 \
They have been orphaned for ten years and are unlikely to be upgraded (except ntfsfallocate, if there is some demand)."
LICENSE = "GPL-2.0-or-later"

PV = "2022.10.3"

RPM_NAME = "ntfsprogs-extra-2022.10.3-2.3.aarch64.rpm"
RPM_HASH = "f4adb9e59ebe215ad52506b9ca89aa1701a948ee2ade2848080d043906bfe34737ff72ca4fd6b0aa3ed4c19ae2df52d3cca619a4b8d8d792da3bcb96c42c27e2"

RPROVIDES:${PN} += "ntfsprogs-extra \
ntfsprogs-extra(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libntfs-3g.so.89()(64bit)"

inherit rpm

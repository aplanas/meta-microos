SUMMARY = "Experimental APFS tools for Linux"
DESCRIPTION = "apfsprogs is a suite of userland software to work with the Apple File System \
on Linux. It's intended mainly to help test the Linux kernel module that can \
be retrieved from <git://github.com/eafer/linux-apfs-rw.git>. The following \
are included: \
 \
  o mkapfs: an experimental filesystem build tool \
  o apfs-snap: a tool to take snapshots of a volume mounted with our module \
  o apfsck: a filesystem integrity checker, for now only useful for testers"
LICENSE = "GPL-2.0"

PV = "0~git453"

RPM_NAME = "apfsprogs-0~git453-1.1.aarch64.rpm"
RPM_HASH = "41c17e65d7a4ff69402391564a32115a5f0261ef75d44442ab0fda6a8e7ac56f2ef2e3424edf639f71aeab74c9d1b9119c9b13cb4986f6cf95360a4d8feeda7a"

RPROVIDES:${PN} += "apfsprogs"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

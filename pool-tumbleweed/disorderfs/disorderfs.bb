SUMMARY = "FUSE filesystem that introduces non-determinism"
DESCRIPTION = "disorderfs is an overlay FUSE filesystem that introduces non-determinism into \
filesystem metadata. For example, it can randomize the order in which \
directory entries are read. This is useful for detecting non-determinism \
in the build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.11"

RPM_NAME = "disorderfs-0.5.11-1.3.aarch64.rpm"
RPM_HASH = "7acdcf1b21b96dadd0e056f4586bf3f1365fb9027ac6ba17c1e7611fad61bb8c1c5c768fd42267837e4cebd537294b1845f4cfa38613e193684c96d4bc4b877c"

RPROVIDES:${PN} += "disorderfs"

RDEPENDS:${PN} += "fuse \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libulockmgr.so.1"

inherit rpm

SUMMARY = "FUSE filesystem that introduces non-determinism"
DESCRIPTION = "disorderfs is an overlay FUSE filesystem that introduces non-determinism into \
filesystem metadata. For example, it can randomize the order in which \
directory entries are read. This is useful for detecting non-determinism \
in the build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.11"

RPM_NAME = "disorderfs-0.5.11-1.4.aarch64.rpm"
RPM_HASH = "fd64b00379a8251c3e6dd283f3b1937bd6410c542a91271d19fd5da9671f8134223dba7629f53a2d1e36d1591431b82be0e906d4f2a4d787db7e1c6f4f3dd22e"

RPROVIDES:${PN} += "disorderfs"

RDEPENDS:${PN} += "fuse \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libulockmgr.so.1"

inherit rpm

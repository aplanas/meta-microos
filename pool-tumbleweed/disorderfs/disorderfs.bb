SUMMARY = "FUSE filesystem that introduces non-determinism"
DESCRIPTION = "disorderfs is an overlay FUSE filesystem that introduces non-determinism into \
filesystem metadata. For example, it can randomize the order in which \
directory entries are read. This is useful for detecting non-determinism \
in the build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.11"

RPM_NAME = "disorderfs-0.5.11-1.3.aarch64.rpm"
RPM_HASH = "7acdcf1b21b96dadd0e056f4586bf3f1365fb9027ac6ba17c1e7611fad61bb8c1c5c768fd42267837e4cebd537294b1845f4cfa38613e193684c96d4bc4b877c"

RPROVIDES:${PN} += "disorderfs \
disorderfs(aarch-64)"
RDEPENDS:${PN} += "fuse \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
libfuse.so.2(FUSE_2.9)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libulockmgr.so.1()(64bit)"

inherit rpm

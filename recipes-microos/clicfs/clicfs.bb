SUMMARY = "Compressed Loop Image Container"
DESCRIPTION = "Clic FS is a FUSE file system to mount a Compressed Loop Image \
Container. It has several features that make it a good choice for live \
systems. It will compress a Loop Image and export it as read write, \
creating a copy on write behaviour."
LICENSE = "GPL-2.0"

PV = "1.4.6"

RPM_NAME = "clicfs-1.4.6-7.28.aarch64.rpm"
RPM_HASH = "fc3975063c67aab62b6a064b1fbcdc2b6ec6fc3f5dfcd833b2616bfbc23c60b21bfdc1aaca89990ff46c53d376f5352bb6579cc2d7b4f2cf7008659d3602d076"

RPROVIDES:${PN} += "clicfs \
clicfs(aarch-64)"
RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm

SUMMARY = "Ceph Object Storage Daemon"
DESCRIPTION = "ceph-osd is the object storage daemon for the Ceph distributed file \
system.  It is responsible for storing objects on a local file system \
and providing access to them over the network."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-osd-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "214b10d41dad78d3b4466948836b10e2a6752e6be22f4ae05afef63d6253e075e54cd2c1e85a4f57c212413ac2ba024347d825515191492338302062363bbaaf"

RPROVIDES:${PN} += "ceph-osd ceph-osd(aarch-64) ceph-test:/usr/bin/ceph-osdomap-tool config(ceph-osd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ceph-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libceph-common.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfmt.so.9()(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libleveldb.so.1()(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit) libresolv.so.2()(64bit) libresolv.so.2(GLIBC_2.17)(64bit) libsnappy.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libstoragemgmt libtcmalloc.so.4()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libz.so.1()(64bit) lvm2 python3-ceph-common sudo"

inherit rpm

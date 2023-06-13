SUMMARY = "Ceph Base Package"
DESCRIPTION = "Base is the package that includes all the files shared amongst ceph servers"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-base-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "aabd9b46b6e059cae3b7bb35a442bc8e3e5d039b56b8e0fa685f03ff417093e6461c4b4641a07a1ea35be5584e89a30d96b728f4943fe4bc546c1e349ef30f20"

RPROVIDES:${PN} += "ceph-base \
ceph-base(aarch-64) \
ceph-test:/usr/bin/ceph-kvstore-tool \
config(ceph-base) \
libceph_crypto_openssl.so()(64bit) \
libceph_lz4.so.2()(64bit) \
libceph_snappy.so.2()(64bit) \
libceph_zlib.so.2()(64bit) \
libceph_zstd.so.2()(64bit) \
libcls_2pc_queue.so.1()(64bit) \
libcls_cas.so.1()(64bit) \
libcls_cephfs.so.1()(64bit) \
libcls_cmpomap.so.1()(64bit) \
libcls_fifo.so.1()(64bit) \
libcls_hello.so.1()(64bit) \
libcls_journal.so.1()(64bit) \
libcls_kvs.so.1()(64bit) \
libcls_lock.so.1()(64bit) \
libcls_log.so.1()(64bit) \
libcls_lua.so.1()(64bit) \
libcls_numops.so.1()(64bit) \
libcls_otp.so.1()(64bit) \
libcls_queue.so.1()(64bit) \
libcls_rbd.so.1()(64bit) \
libcls_refcount.so.1()(64bit) \
libcls_rgw.so.1()(64bit) \
libcls_rgw_gc.so.1()(64bit) \
libcls_sdk.so.1()(64bit) \
libcls_timeindex.so.1()(64bit) \
libcls_user.so.1()(64bit) \
libcls_version.so.1()(64bit) \
libec_clay.so()(64bit) \
libec_isa.so()(64bit) \
libec_jerasure.so()(64bit) \
libec_jerasure_generic.so()(64bit) \
libec_jerasure_neon.so()(64bit) \
libec_lrc.so()(64bit) \
libec_shec.so()(64bit) \
libec_shec_generic.so()(64bit) \
libec_shec_neon.so()(64bit) \
libos_tp.so.1()(64bit) \
libosd_tp.so.1()(64bit) \
python3.10dist(ceph-volume) \
python3dist(ceph-volume)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ceph-common \
cryptsetup \
e2fsprogs \
findutils \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libceph-common.so.2()(64bit) \
libcephfs.so.2()(64bit) \
libcephfs2 \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libleveldb.so.1()(64bit) \
liblttng-ust.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
liboath.so.0()(64bit) \
liboath.so.0(LIBOATH_1.10.0)(64bit) \
liboath.so.0(LIBOATH_1.12.0)(64bit) \
liboath.so.0(LIBOATH_1.2.0)(64bit) \
librados.so.2()(64bit) \
librados.so.2(LIBRADOS_14.2.0)(64bit) \
librados2 \
librbd1 \
librgw2 \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtcmalloc.so.4()(64bit) \
libz.so.1()(64bit) \
logrotate \
parted \
psmisc \
python(abi) \
python3-setuptools \
smartmontools \
util-linux \
which \
xfsprogs"

inherit rpm

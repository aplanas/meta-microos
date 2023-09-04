SUMMARY = "Ceph Base Package"
DESCRIPTION = "Base is the package that includes all the files shared amongst ceph servers"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-base-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "9a268c6588b05151ee50c2f49639f592ea7a56a2d14b4f7c5f73635430156140618c0f6a33d1eab2c971779d212f058d4f3435bbbc2826864907da88428be2df"

RPROVIDES:${PN} += "ceph-base \
ceph-test-/usr/bin/ceph-kvstore-tool \
config-ceph-base \
libceph-crypto-openssl.so \
libceph-lz4.so.2 \
libceph-snappy.so.2 \
libceph-zlib.so.2 \
libceph-zstd.so.2 \
libcls-2pc-queue.so.1 \
libcls-cas.so.1 \
libcls-cephfs.so.1 \
libcls-cmpomap.so.1 \
libcls-fifo.so.1 \
libcls-hello.so.1 \
libcls-journal.so.1 \
libcls-kvs.so.1 \
libcls-lock.so.1 \
libcls-log.so.1 \
libcls-lua.so.1 \
libcls-numops.so.1 \
libcls-otp.so.1 \
libcls-queue.so.1 \
libcls-rbd.so.1 \
libcls-refcount.so.1 \
libcls-rgw-gc.so.1 \
libcls-rgw.so.1 \
libcls-sdk.so.1 \
libcls-timeindex.so.1 \
libcls-user.so.1 \
libcls-version.so.1 \
libec-clay.so \
libec-isa.so \
libec-jerasure-generic.so \
libec-jerasure-neon.so \
libec-jerasure.so \
libec-lrc.so \
libec-shec-generic.so \
libec-shec-neon.so \
libec-shec.so \
libos-tp.so.1 \
libosd-tp.so.1 \
python3.11dist-ceph-volume \
python3dist-ceph-volume"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ceph-common \
cryptsetup \
e2fsprogs \
findutils \
grep \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcephfs.so.2 \
libcephfs2 \
libcrypto.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libleveldb.so.1 \
liblttng-ust.so.1 \
liblua5.4.so.5 \
liblz4.so.1 \
libm.so.6 \
liboath.so.0 \
librados.so.2 \
librados2 \
librbd1 \
librgw2 \
libsnappy.so.1 \
libstdc++.so.6 \
libtcmalloc.so.4 \
libz.so.1 \
logrotate \
parted \
psmisc \
python-abi \
python3-setuptools \
smartmontools \
util-linux \
which \
xfsprogs"

inherit rpm

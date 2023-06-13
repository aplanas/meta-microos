SUMMARY = "Ceph Common"
DESCRIPTION = "Common utilities to mount and interact with a ceph storage cluster. \
Comprised of files that are common to Ceph clients and servers."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-common-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "74a1cf08bd575df03543836092dc41e424615c2d69144e057cbc414b658e9499dc0e0921668552aee7811b2e9625acabbcd6169a88823c5c3547d47e7452693b"

RPROVIDES:${PN} += "ceph-common \
ceph-common(aarch-64) \
config(ceph-common)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libbabeltrace-ctf.so.1()(64bit) \
libbabeltrace.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libcap-ng.so.0()(64bit) \
libceph-common.so.2()(64bit) \
libcephfs2 \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libkeyutils.so.1()(64bit) \
libldap.so.2()(64bit) \
libleveldb.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libncurses.so.6()(64bit) \
liboath.so.0()(64bit) \
librados.so.2()(64bit) \
librados2 \
librbd.so.1()(64bit) \
librbd1 \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtcmalloc.so.4()(64bit) \
libtinfo.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libz.so.1()(64bit) \
permissions \
python3-PrettyTable \
python3-ceph-argparse \
python3-ceph-common \
python3-cephfs \
python3-rados \
python3-rbd \
python3-rgw \
shadow \
systemd"

inherit rpm

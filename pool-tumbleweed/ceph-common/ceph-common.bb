SUMMARY = "Ceph Common"
DESCRIPTION = "Common utilities to mount and interact with a ceph storage cluster. \
Comprised of files that are common to Ceph clients and servers."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-common-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "c4b604719e34770eaf69db585b2a5878a3c8138977a3c33cdd02f6dd473c498c108b5bbb9bd7e280807d3a989e6771984d95477afac7958f2e8264c79e719e06"

RPROVIDES:${PN} += "ceph-common \
config-ceph-common"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libceph-common.so.2 \
libcephfs2 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libfmt.so.9 \
libgcc-s.so.1 \
libicuuc.so.73 \
libkeyutils.so.1 \
libldap.so.2 \
libleveldb.so.1 \
liblua5.4.so.5 \
liblz4.so.1 \
libm.so.6 \
libncurses.so.6 \
liboath.so.0 \
librados.so.2 \
librados2 \
librbd.so.1 \
librbd1 \
libsnappy.so.1 \
libstdc++.so.6 \
libtcmalloc.so.4 \
libtinfo.so.6 \
libudev.so.1 \
libz.so.1 \
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

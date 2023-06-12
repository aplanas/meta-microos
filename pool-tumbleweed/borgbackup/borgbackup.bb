SUMMARY = "Deduplicating backup program with compression and authenticated encryption"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "926a07a6e191aab49f3c989f59f90ca6b240374116c6176a1c75522cfe33bb1779474bff2bcb5fb05f20ee8fa04aadebb7b49fc83270231f344cd6e9bce80c3e"

RPROVIDES:${PN} += "borgbackup \
borgbackup(aarch-64) \
python3.10dist(borgbackup) \
python3dist(borgbackup)"
RDEPENDS:${PN} += "(python3-msgpack >= 0.5.6 with python3-msgpack <= 1.0.5) \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liblz4.so.1()(64bit) \
libzstd.so.1()(64bit) \
python(abi) \
python3-packaging \
python3-pyfuse3"

inherit rpm

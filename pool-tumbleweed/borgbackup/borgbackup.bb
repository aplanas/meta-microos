SUMMARY = "Deduplicating backup program with compression and authenticated encryption"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-1.2.4-1.3.aarch64.rpm"
RPM_HASH = "e6635ed36cce6faa275ac2526274ac829b7d38451b7b3609d9e50f5fa524c6c882f870a4163cd61b189539616b214eda4391f6e1e5fec583b67925a05720289a"

RPROVIDES:${PN} += "borgbackup \
python3.11dist-borgbackup \
python3dist-borgbackup"

RDEPENDS:${PN} += "-python3-msgpack >= 0.5.6 with python3-msgpack <= 1.0.5 \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python3-packaging \
python3-pyfuse3"

inherit rpm

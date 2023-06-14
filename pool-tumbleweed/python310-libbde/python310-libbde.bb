SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python310-libbde-20221031-3.9.aarch64.rpm"
RPM_HASH = "e0bfcb5307a677ae8eb8eede9ec914c26508bb4a009a1b1f18a6a29960e7f1a7e07a9f436ce3b4705a2c5c3285301323e7b7189e3de179df5c58b71392750c7a"

RPROVIDES:${PN} += "python3-libbde \
python310-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

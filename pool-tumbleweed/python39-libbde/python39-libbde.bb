SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python39-libbde-20221031-4.1.aarch64.rpm"
RPM_HASH = "3f88872a6f2424dbd54c3f378ad4b7d4b37f1e062fb45889dbe338f0a4ea3af1973171a6202e7863ce371c2c21b1391b5d345c23d7ee059e4e769417aaf9fc56"

RPROVIDES:${PN} += "python39-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

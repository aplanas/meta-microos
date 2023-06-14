SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python39-libbde-20221031-3.9.aarch64.rpm"
RPM_HASH = "581ccbd61170e4c3b2bea3489474087f4d9967965cdc6bce90a63109a654deef9e2da34be6f49b9c19f1b8376c482c2aa31a0b45629299c90f3a107c608d6198"

RPROVIDES:${PN} += "python39-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

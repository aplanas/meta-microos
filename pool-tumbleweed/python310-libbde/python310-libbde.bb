SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python310-libbde-20221031-4.1.aarch64.rpm"
RPM_HASH = "86a0d6b0220b6917f1f0f06d318e36a9e9d816b1c6c59532a7e22ac0ea1b886a47cd708e08b6b2fdbe32b185cb7e03f83e68410b90ad5042611760e0b928a860"

RPROVIDES:${PN} += "python310-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

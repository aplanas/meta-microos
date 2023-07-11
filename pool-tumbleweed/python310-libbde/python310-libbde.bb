SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python310-libbde-20221031-3.12.aarch64.rpm"
RPM_HASH = "cc4d2180b5e57de8e70982fdd81db149260e3198587fc1220395883df53e9aa0a551d100341530ebf8702daf3853563ed8e69142e84faae0e889661a7905f9c4"

RPROVIDES:${PN} += "python310-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

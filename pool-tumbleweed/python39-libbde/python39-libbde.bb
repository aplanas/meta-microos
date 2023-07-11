SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python39-libbde-20221031-3.12.aarch64.rpm"
RPM_HASH = "670025b369e1c46f751f683124cbac44b00644d6166ed60b4eb516972d6e127684bdfe2d3c328ed5903cbb2b058c4804bb9f4f74de707479d219ffa0f3042206"

RPROVIDES:${PN} += "python39-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

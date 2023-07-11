SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python311-libbde-20221031-3.12.aarch64.rpm"
RPM_HASH = "04ca4fec72f60ffbb50c1cbfb3daa08a403bebddd052c3340b18a6de53b544d77dfa1e7f274749806e39c9ef793f7fa45ccb118b82242f436264b656db5e83ae"

RPROVIDES:${PN} += "python3-libbde \
python311-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

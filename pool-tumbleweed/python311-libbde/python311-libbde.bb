SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python311-libbde-20221031-3.9.aarch64.rpm"
RPM_HASH = "9d0ff262d0e9796a0ddded85c25616db3ea6dfc0e11930cd6a709e7a1cecf3187d4de84bb1fd297e0fee3918df0542fd5d23eb50841d3887963a2f487cb4227b"

RPROVIDES:${PN} += "python311-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python311-libbde-20221031-3.13.aarch64.rpm"
RPM_HASH = "83669e34f3ade5c8a79d69532a0cc67d246d1b9f664551988e90131f44eb1f566b6a7e2a6320848470340b6d6646dc491ee7ec64beff1d849f315fb4359e3fb4"

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

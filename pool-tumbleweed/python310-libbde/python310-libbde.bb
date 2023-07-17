SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python310-libbde-20221031-3.13.aarch64.rpm"
RPM_HASH = "f8815687967a549e5d345d7a1aa4dbd61971009b01ea845dd062198027cebcae74476daac0a00935707431ca034775862aedc3d83ae45397f0370d71ee43110f"

RPROVIDES:${PN} += "python310-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

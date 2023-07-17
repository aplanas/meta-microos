SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python39-libbde-20221031-3.13.aarch64.rpm"
RPM_HASH = "a1932f8bf077e85e0f0992228485c3a7e0f4483539c675ea428d814256355a64edd8a0d75ba930aabaee046e240fea8181d05976fe26abf6f3f42bc4aaf16859"

RPROVIDES:${PN} += "python39-libbde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
python-abi"

inherit rpm

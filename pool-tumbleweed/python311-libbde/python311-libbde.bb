SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python311-libbde-20221031-4.1.aarch64.rpm"
RPM_HASH = "5a85beaaa06444b207affffa9728459ea7354d906a7017d3e5512d39c25a38fc47ea2a87e55109ac8939f6de9279e7c71d7556fd46474527aeed072b82ba24d0"

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

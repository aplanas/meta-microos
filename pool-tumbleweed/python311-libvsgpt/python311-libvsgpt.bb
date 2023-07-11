SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python311-libvsgpt-20221029-3.9.aarch64.rpm"
RPM_HASH = "017bb0e02454d5a616637e68ced8ef8d4def706c35146634df6f3c5e7187e34fd4069a8d49caac097bf35f94090f1f83bdbd5bb36a0d1fb62d4169b6f1845ec7"

RPROVIDES:${PN} += "python3-libvsgpt \
python311-libvsgpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvsgpt.so.1 \
python-abi"

inherit rpm

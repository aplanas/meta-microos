SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python310-libvsgpt-20221029-4.1.aarch64.rpm"
RPM_HASH = "73f4de3429b4ff37727ef4638acc8a78440cc848f8c6b94eedaac22ab129f6a40734545b1a2db33499cf640c956e5fb1a4b947b8b744428d0ea3212c4cf20041"

RPROVIDES:${PN} += "python310-libvsgpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvsgpt.so.1 \
python-abi"

inherit rpm

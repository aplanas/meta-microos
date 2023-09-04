SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python39-libvsgpt-20221029-4.1.aarch64.rpm"
RPM_HASH = "2f0e046485bf128adb20a1bdff5c065da9c1f9659d1b2fcd6c67dae051fc476046852948f0ca63c9b626578d29428aae69bf8e31743c291732cb840c69643dff"

RPROVIDES:${PN} += "python39-libvsgpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvsgpt.so.1 \
python-abi"

inherit rpm

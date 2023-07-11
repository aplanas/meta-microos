SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python310-libvsgpt-20221029-3.9.aarch64.rpm"
RPM_HASH = "99316ef55d0d3550e058ca903d0331ed66c7df387e73d58d106a962b9301991d3b674d5e92741be8822ab5f430b4999f05757614a73b3a22a7dcd9f5909f3e49"

RPROVIDES:${PN} += "python310-libvsgpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvsgpt.so.1 \
python-abi"

inherit rpm

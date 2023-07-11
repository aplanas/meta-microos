SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python39-libvsgpt-20221029-3.9.aarch64.rpm"
RPM_HASH = "738ea36e1cf54cf2e806b1054000590e61c131fd0ceb43407dfdeb6a4bc51b9b2d7c828c98976e667c654c13a5da6c97d4b0310e187200f9149232a3a8a63e35"

RPROVIDES:${PN} += "python39-libvsgpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvsgpt.so.1 \
python-abi"

inherit rpm

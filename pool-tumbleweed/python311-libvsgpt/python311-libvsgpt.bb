SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python311-libvsgpt-20221029-4.1.aarch64.rpm"
RPM_HASH = "333a9f1ed9b23b2c86ead243609eff34bcdc94f08662ad210676298ff92e35eedda2b28584e8aae6107947fa0678841f87004812b286fe889183227314c671e3"

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

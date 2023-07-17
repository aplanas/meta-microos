SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python310-libvmdk-20221124-3.11.aarch64.rpm"
RPM_HASH = "9f72003e42b47d888a5b575546624bec9dc0bf6efa39a173fdb8d3fe6355f2da7e6079c2559642e98afd4835638b0384d888f0beada96328a2b907befa535671"

RPROVIDES:${PN} += "python310-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm

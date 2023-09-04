SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python311-libvmdk-20221124-4.1.aarch64.rpm"
RPM_HASH = "da5156172cc4f395c7a008ea51a278a8980b01f4b5f90d07f6ab5887f8487b9f2671052553be811d320c9b83cc0fac396fb78c8a8cc65cdb13b8768f5ef01ccc"

RPROVIDES:${PN} += "python3-libvmdk \
python311-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm

SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python310-libvmdk-20221124-4.1.aarch64.rpm"
RPM_HASH = "d5581d4762e59039ac8c3dfc5fad1eb485bd17f50ec7a49f90b80e756127534e2f86d4dfe79bdab1956b28ac42e98040ed633413cabadba376706a2183741806"

RPROVIDES:${PN} += "python310-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm

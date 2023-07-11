SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python310-libvmdk-20221124-3.10.aarch64.rpm"
RPM_HASH = "95218ea00e63c94aab4d73ad1a1dadb7e517f8e80e9b670dcfbafd048c1d0df3549ccd07c21285c2a530df18d04fd9e65bf6d992d475836f9e61098210c8e774"

RPROVIDES:${PN} += "python310-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm

SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python311-libvmdk-20221124-3.7.aarch64.rpm"
RPM_HASH = "f5abace69209d745802d682256b3be4ff8ade345d8980d87575696ebfef12cb22ccb3d18a230ff974055c0c6d8fe3b3871c37b75facffc33679c78dc9ecd042d"

RPROVIDES:${PN} += "python311-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm

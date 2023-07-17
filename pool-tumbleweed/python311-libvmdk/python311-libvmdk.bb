SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python311-libvmdk-20221124-3.11.aarch64.rpm"
RPM_HASH = "aca395d9189fa437cbb7430d706cc8de89196e0692641eeca296e59a0c96a9f6d81e328f48c04ebd3c37ca37f5ba50ed290cdef03df079538e32d2b89b1fade7"

RPROVIDES:${PN} += "python3-libvmdk \
python311-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm

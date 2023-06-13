SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python310-libvmdk-20221124-3.7.aarch64.rpm"
RPM_HASH = "4b140cacdba2aac7ad7457695af537c3ecb9b08477f43c581c426092620dfccc3b3b28a7ccea3a4fb02ba667bb3cf53cbb5a05890d3e3954f5c1b2615d4624ce"

RPROVIDES:${PN} += "python3-libvmdk \
python310-libvmdk \
python310-libvmdk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libvmdk.so.1()(64bit) \
libvmdk.so.1(V_20221124)(64bit) \
python(abi)"

inherit rpm

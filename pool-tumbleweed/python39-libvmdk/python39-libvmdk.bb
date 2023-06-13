SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python39-libvmdk-20221124-3.7.aarch64.rpm"
RPM_HASH = "90b5c45c61b56c647a5580c604fce41290a3953219928d0c4e5e17f893feea1dea024960d4e3bb31d2f8519da9d4d80db4061b7e8254df1804a8a09ecff9e953"

RPROVIDES:${PN} += "python39-libvmdk \
python39-libvmdk(aarch-64)"

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

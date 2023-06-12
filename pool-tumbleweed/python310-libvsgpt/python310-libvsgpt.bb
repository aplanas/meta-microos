SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python310-libvsgpt-20221029-3.7.aarch64.rpm"
RPM_HASH = "c3db27bbd82f3e276f8e862aefac2dfe0b0987b42a546eeaf68610e4b7bdd22206390fcc7e5e93951ad9b766da73148a69588a1bf8585d862a79f46eda01a029"

RPROVIDES:${PN} += "python3-libvsgpt \
python310-libvsgpt \
python310-libvsgpt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libvsgpt.so.1()(64bit) \
libvsgpt.so.1(V_20221029)(64bit) \
python(abi)"

inherit rpm

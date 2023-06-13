SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python39-libluksde-20221103-3.9.aarch64.rpm"
RPM_HASH = "22e69f29f6be8778a7fb36eb658fca9b2f88b7b0558ac5b23d2d41c187280f3dbc3e0e2d3e7750927c8286aa43e0e7cc19f54608020fff65eae7d8b61bfb5c6a"

RPROVIDES:${PN} += "python39-libluksde \
python39-libluksde(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libluksde.so.1()(64bit) \
libluksde.so.1(V_20221103)(64bit) \
python(abi)"

inherit rpm

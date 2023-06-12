SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python311-libsmdev-20221028-2.8.aarch64.rpm"
RPM_HASH = "8e108ddac7a813accb7a4afbec89dde5f5da7631f9cb1c19dc2b9ba54b2bfc1bc87910bbf67d922c56c5620ea522cc32905469319c0f7426e22e36165b3f81a5"

RPROVIDES:${PN} += "python311-libsmdev \
python311-libsmdev(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libsmdev.so.1()(64bit) \
libsmdev.so.1(V_20221028)(64bit) \
python(abi)"

inherit rpm

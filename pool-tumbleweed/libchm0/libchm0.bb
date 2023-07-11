SUMMARY = "A library for dealing with ITSS/CHM files"
DESCRIPTION = "CHMLIB is a library for dealing with Microsoft ITSS/CHM format files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "libchm0-0.40-24.9.aarch64.rpm"
RPM_HASH = "fa8b0685ad24eae11ad35d09cf8fc5d61d135fb6a48fa9c05cd6157ded178f9b00ecb548a902b4db5c145e445742749558ce5de984a7f2e38ffd36d9c457078f"

RPROVIDES:${PN} += "chmlib \
libchm.so.0 \
libchm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

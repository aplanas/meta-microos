SUMMARY = "A library for GUID/UUID data types"
DESCRIPTION = "A library for GUID/UUID data types. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220113"

RPM_NAME = "libfguid1-20220113-3.3.aarch64.rpm"
RPM_HASH = "73c2fd52350d04be5e0b3c91f72232ef8312d6ce0031637b816c3e48ccc514bb1448c347976f192b030d73af830bfdf6fa242acf72790be0cffa04a7588fb197"

RPROVIDES:${PN} += "libfguid.so.1 \
libfguid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm

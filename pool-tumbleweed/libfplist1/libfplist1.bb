SUMMARY = "Library for plist formats"
DESCRIPTION = "libfplist is a library for plist formats. \
 \
Part of the libyal family of libraries. \
 \
Read-only supported formats: \
 \
  * XML plist format \
 \
Unsupported formats: \
 \
  * ASCII plist format \
  * Binary plist format"
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libfplist1-20220116-3.7.aarch64.rpm"
RPM_HASH = "53b790ca5a057b180c897cb92767ebfa0bbe939446118099aa810e38f736b23d725d80831cd64c81757565fbd489153b0f9e0a7f8bc248fe25251fb619defa33"

RPROVIDES:${PN} += "libfplist.so.1 \
libfplist1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libfguid.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm

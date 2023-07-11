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

RPM_NAME = "libfplist1-20220116-3.6.aarch64.rpm"
RPM_HASH = "20cd1289fba36d05ae8104f89be4ab228a92be445481159b49150c212630e8dafbff04006b08db2304fa911865a17ce75d8a14e73fbfc2f4b972f07f88df5c68"

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

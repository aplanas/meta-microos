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

RPM_NAME = "libfplist1-20220116-3.4.aarch64.rpm"
RPM_HASH = "02777735e804927519f62fc8355cd165f252daba455826d06efe2cdc1c638d617ebfc706fa324f32562119dcd5ddb1ff05e2a4a0c257495149d3acaafa44fa69"

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

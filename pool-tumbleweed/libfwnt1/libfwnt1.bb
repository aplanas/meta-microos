SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "libfwnt1-20220922-2.5.aarch64.rpm"
RPM_HASH = "70ca826129c2eb4da4bac2530637f0a935f575123566aa78a0d339a31b9a962525eb8bb784069e389b034494145074d35292a46f59897572d50ae0fffd76c059"

RPROVIDES:${PN} += "libfwnt.so.1 \
libfwnt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm

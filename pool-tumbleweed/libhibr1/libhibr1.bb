SUMMARY = "Library for access the Windows Hibernation File format"
DESCRIPTION = "libhibr is a library to access the Windows Hibernation File \
(hiberfil.sys) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr1-20210421-3.6.aarch64.rpm"
RPM_HASH = "fa4d68d44982efe3c1507d70a40a3275040ebdc3d2ec9a612149cf98dbf2a83f9f6d6b54a859bc0ebf008b50ba2b598934e82e24dc76bf88f6fc75470180a894"

RPROVIDES:${PN} += "libhibr.so.1 \
libhibr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1"

inherit rpm

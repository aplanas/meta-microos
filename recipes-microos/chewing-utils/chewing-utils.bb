SUMMARY = "Hash editor for libchewing"
DESCRIPTION = "This package contains a hash editor for chewing, an intelligent phonetic \
input method library for tranditional Chinese. \
 \
It's used to add, modify and remove entries in the chewing user database \
(usually located at ~/.chewing/uhash.dat)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "chewing-utils-0.5.1+git20200627.452f622-1.9.aarch64.rpm"
RPM_HASH = "d4bb041ad9f805bbcb8cbbad8613b714b63e280bb35fcdf22503c43e841bdda8cdada6cbded7a38cfc66818026eaf6ca8083c58fd82355747627538c57aa85b3"

RPROVIDES:${PN} += "chewing-utils chewing-utils(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libchewing.so.3()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit)"

inherit rpm

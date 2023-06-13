SUMMARY = "IETF YANG data modeling parser toolkit runtime"
DESCRIPTION = "Libyang implements functions to process schemas expressed in the \
YANG data modeling language defined by the IETF in RFCs 6020/7950. \
Schemas expressed in this language primarily describe configuration \
used by larger network equipment like routers and switches. \
 \
In addition to handling the schemas itself, the library also provides \
functions to process data described by the schemas. \
 \
The library is implemented in C and provides an API for other software \
to use in processing configurations."
LICENSE = "BSD-3-Clause"

PV = "2.1.55"

RPM_NAME = "libyang2-2.1.55-1.1.aarch64.rpm"
RPM_HASH = "a33c34e649b08e1abd2d856cad8c2b21c390cd97b1c9e52f5a62faee8cdc699d1772ce8e5ee2765eeb16c27ea009e3c2f9c1fabdb209e61fbaf332ca20e9d039"

RPROVIDES:${PN} += "libyang.so.2()(64bit) \
libyang2 \
libyang2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm

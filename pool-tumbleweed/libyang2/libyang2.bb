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

RPM_NAME = "libyang2-2.1.55-1.2.aarch64.rpm"
RPM_HASH = "bb623a6963356fa2e5569fccb6593b55a15b55c0bbedc7d3d92c4bbd55147efac52ac079e9d77fb37f333faad93e05d233f66cd95f1d7bfa1635c30630b20b71"

RPROVIDES:${PN} += "libyang.so.2 \
libyang2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm

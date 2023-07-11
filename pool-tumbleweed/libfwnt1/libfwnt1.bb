SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "libfwnt1-20220922-2.7.aarch64.rpm"
RPM_HASH = "c61648e089d86292de2beadb8991d3ce6515b584b1250e95ea2f87452b8c452bd2b38e1268caf20a0b384fb35f6715cedea1c7a0a8aef8838dbc012a64a6a625"

RPROVIDES:${PN} += "libfwnt.so.1 \
libfwnt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm

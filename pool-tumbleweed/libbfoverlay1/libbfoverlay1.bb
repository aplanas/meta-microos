SUMMARY = "Library for Update Sequence Number (USN) Journal data types"
DESCRIPTION = "libbfoverlay is a library to provide basic file overlay support. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210416"

RPM_NAME = "libbfoverlay1-20210416-3.3.aarch64.rpm"
RPM_HASH = "23747d3e623262a02e0c90cd8ed055bbb2c489e22f99e63da1e71c4c712d0e3b15510902d5895023bc0614e5ba8ca5d8a58e3cac64f35f40e6fcfc41b543ab64"

RPROVIDES:${PN} += "libbfoverlay.so.1 \
libbfoverlay1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfvalue.so.1"

inherit rpm

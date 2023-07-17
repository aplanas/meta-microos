SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20220105"

RPM_NAME = "libcdirectory1-20220105-2.7.aarch64.rpm"
RPM_HASH = "956dc045e433eac08587d34110213d640a2374ad03e6cf9e3335d0214d3c110efaf7a9b3de1503081150336b83c84ccd949f91cb8e994cb43189acf926f3a310"

RPROVIDES:${PN} += "libcdirectory.so.1 \
libcdirectory1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libuna.so.1"

inherit rpm

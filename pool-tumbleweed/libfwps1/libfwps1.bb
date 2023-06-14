SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "libfwps1-20230202-1.4.aarch64.rpm"
RPM_HASH = "88fa1fd85f4ccfa8e666937e5b9eacc653db4dc27196f48c516212c0f461e16f1866eb5a36aae9cb23066a24fcae021bdd1baac4928068d3bd2adca6871a0ed5"

RPROVIDES:${PN} += "libfwps.so.1 \
libfwps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libuna.so.1"

inherit rpm

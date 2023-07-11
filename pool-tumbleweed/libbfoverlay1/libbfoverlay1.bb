SUMMARY = "Library for Update Sequence Number (USN) Journal data types"
DESCRIPTION = "libbfoverlay is a library to provide basic file overlay support. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210416"

RPM_NAME = "libbfoverlay1-20210416-3.4.aarch64.rpm"
RPM_HASH = "606f25246dabe2f62c0772f4d015b9c52319a6f2f8442b2733c3d496f9a794234200bdd92f25ccff13628fe6e9cf6c8aee0f2c8f3c8936ed8b3bbfa557652743"

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

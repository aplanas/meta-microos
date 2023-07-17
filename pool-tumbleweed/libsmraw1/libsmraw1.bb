SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw1-20230320-1.8.aarch64.rpm"
RPM_HASH = "3222d4497140101244b506823768e5039c7575bf91a97dae959df3d58646a53d3e470f9d0fa6979e485cb538cd2123aabc758c321df68570bdf83063c9ea86a0"

RPROVIDES:${PN} += "libsmraw.so.1 \
libsmraw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm

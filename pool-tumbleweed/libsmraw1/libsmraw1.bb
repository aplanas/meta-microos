SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw1-20230320-1.7.aarch64.rpm"
RPM_HASH = "9d18e2be1a51ee3e4b6c4a8de20488c8fe513ea6ef8a707fa079b0f612e5498b643d354d484db87a8a8b1991c103e138cdbf59b1d4e35c1454fd79a1c277dc6a"

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

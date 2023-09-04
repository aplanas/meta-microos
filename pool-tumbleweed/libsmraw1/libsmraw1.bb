SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw1-20230320-2.1.aarch64.rpm"
RPM_HASH = "3f9f9ee60a640744e1d78bb667052a04a26d753b6fc88fcaaa73699484595ac7befaf35b1a044907faceda5eeea043829196610ae8db6bceb9db8c3bb9a1128a"

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

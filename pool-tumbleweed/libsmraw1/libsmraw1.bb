SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw1-20230320-1.3.aarch64.rpm"
RPM_HASH = "05126441372e1dcc80d7030ef520a93612121dc2b95604139b68e835c188656b8edb0e09b05ebc6bec064181a30fb85735d8a707e63833bc7d6b4813417061c1"

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

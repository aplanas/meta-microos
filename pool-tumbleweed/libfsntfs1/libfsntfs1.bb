SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs1-20230606-2.1.aarch64.rpm"
RPM_HASH = "a67aa8768b83d0c550f291243e2b8b2cd675eed0de34a307dae1846c71e2186143f579809203784fc1d180c22084f29fb8aa1a7704aacc38b8b20aa0f2845fb0"

RPROVIDES:${PN} += "libfsntfs.so.1 \
libfsntfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm

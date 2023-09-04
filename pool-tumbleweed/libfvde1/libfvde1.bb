SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "The libfvde library is a library to access the File Vault Drive Encryption format"
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde1-20220915-4.1.aarch64.rpm"
RPM_HASH = "67eacd118470b96bbea1497a8cb455ea986ad9636d5f7be6569558bc524865907a6f48e334480ff9a450cdf149ce84a6be9b4ebdabcd11a71e8f553bfa96c3aa"

RPROVIDES:${PN} += "libfvde.so.1 \
libfvde1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfplist.so.1 \
libhmac.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm

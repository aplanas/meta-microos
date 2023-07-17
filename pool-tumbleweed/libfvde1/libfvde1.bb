SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "The libfvde library is a library to access the File Vault Drive Encryption format"
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde1-20220915-3.15.aarch64.rpm"
RPM_HASH = "4194d51b41149bdbbb53e2d6c4b9b354bf6b94d3db2eab79dc6ca3ab1541d347ed8bf1fa787745c160ba29296fdc277f6d37c83cd72b59fe589e026ef49963d7"

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

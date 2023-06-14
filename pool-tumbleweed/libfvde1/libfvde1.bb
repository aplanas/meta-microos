SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "The libfvde library is a library to access the File Vault Drive Encryption format"
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde1-20220915-3.11.aarch64.rpm"
RPM_HASH = "f579c9daa7aec9c4d0fc6337f8d613282bb49906eeb7d56f6a3bb01c2e068be768577ae7de9eaa582bbf17630a5f4e7ec6f4a6cb93e2709a14c0fc1c08725466"

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

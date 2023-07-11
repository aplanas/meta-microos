SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "The libfvde library is a library to access the File Vault Drive Encryption format"
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde1-20220915-3.14.aarch64.rpm"
RPM_HASH = "237503cbdab0067e62f8fa912d2a26a0d41f5e1280cf0aceecf4468563b0c520cc5c005bf3f2022746d347264ee7a8bec490e4ee91a552958f28a3d3cfc3cae8"

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

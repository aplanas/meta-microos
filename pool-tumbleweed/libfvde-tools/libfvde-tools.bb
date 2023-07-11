SUMMARY = "Several tools for reading the File Vault Drive Encryption format"
DESCRIPTION = "Several tools for reading the File Vault Drive Encryption format \
 \
See libfvde for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-tools-20220915-3.14.aarch64.rpm"
RPM_HASH = "496f065d29c54a0bf68e5b14bd0aa925c3de629b9a6091f9f688e9171c7bc3e910c42e344738d743648ce3260909f6dcb0021739c07fbd40c13d6b33af01f939"

RPROVIDES:${PN} += "libfvde-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libfuse.so.2 \
libfvde.so.1 \
libfvde1 \
libuna.so.1"

inherit rpm

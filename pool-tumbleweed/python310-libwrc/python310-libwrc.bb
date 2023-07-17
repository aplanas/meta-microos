SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python310-libwrc-20230318-1.5.aarch64.rpm"
RPM_HASH = "2f839cfcde0426c92c453f5ecd4a983439ab95df069986ba354b7e95590e531716fbc624cab5b88ddda465a9a92b50db32896bec9ee5ca3c56edb4e29a67950b"

RPROVIDES:${PN} += "python310-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm

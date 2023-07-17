SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python311-libmodi-20221023-3.12.aarch64.rpm"
RPM_HASH = "81cada9921d0df5516225446a595223515e507b4cf5584692bf298d0064a75b24772bf0f2161125394d5813695fd9cc2554baaf38e8efd755bb7fb388d45fb96"

RPROVIDES:${PN} += "python3-libmodi \
python311-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm

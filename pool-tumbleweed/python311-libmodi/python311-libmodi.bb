SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python311-libmodi-20221023-3.11.aarch64.rpm"
RPM_HASH = "6997b8135210c5bf858d76d2243f68655a7c38d8db708454d137ab07ad8bedbc7c7ff9c0a79a29510622d2e6243c260f572c10f1ce8074a73ac773742c13317f"

RPROVIDES:${PN} += "python3-libmodi \
python311-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm

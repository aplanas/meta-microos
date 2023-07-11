SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python310-libmodi-20221023-3.11.aarch64.rpm"
RPM_HASH = "b6fc419add7feb8799ad9493ab36e6f3a3b004ddf19d12910abc1d3f8ada9b37c1535f118f7231c88d883b9d46bfcbffcf09652a81e6acff34ae0fd8853c0802"

RPROVIDES:${PN} += "python310-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm

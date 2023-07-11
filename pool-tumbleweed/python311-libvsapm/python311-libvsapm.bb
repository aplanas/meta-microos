SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "python311-libvsapm-20210626-4.9.aarch64.rpm"
RPM_HASH = "7cd1c814677253959517464a5c4d0379d81977f7c803386f000df745aa75cd23f973bdc2cff4b3073ff00f1d7890fb39e58c690adc113593f004b0ac440322be"

RPROVIDES:${PN} += "python3-libvsapm \
python311-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm

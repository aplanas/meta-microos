SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "python310-libvsapm-20210626-4.7.aarch64.rpm"
RPM_HASH = "ded14d4967d96d69172392d8cea59fb7ca5776f8133914a6b39955f4eee862cefd1a57e30ce8fdce0cfdfd9704d9ed977beddb2fef08208aea8f8a9dac7a9971"

RPROVIDES:${PN} += "python3-libvsapm \
python310-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm

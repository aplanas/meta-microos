SUMMARY = "Microsoft Azure Storage Client SDK for C++"
DESCRIPTION = "A client library for working with Microsoft Azure storage services including blobs, files, tables, and queues. \
This client library enables working with the Microsoft Azure storage services which include the blob service for storing binary and text data, the file service for storing binary and text data, the table service for storing structured non-relational data, and the queue service for storing messages that may be accessed by a client."
LICENSE = "Apache-2.0"

PV = "7.5.0"

RPM_NAME = "libazurestorage7-7.5.0-1.17.aarch64.rpm"
RPM_HASH = "d9e83403e2c9ad15f38f88f530dd859850b4aae155143a3f16b47b6c867d1fbb6492a2d1bde4fc03ac8bf6d8fba90c0eef02364117eb581226a83726cce43f98"

RPROVIDES:${PN} += "libazurestorage.so.7 \
libazurestorage7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-log.so.1.82.0 \
libc.so.6 \
libcpprest.so.2.10 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1 \
libxml2.so.2"

inherit rpm

SUMMARY = "A C++ implementation of the exmdb wire protocol"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0.58baa16"

RPM_NAME = "libexmdbpp0-1.11.0.58baa16-1.1.aarch64.rpm"
RPM_HASH = "edd8241f25b2a571c67df67bc87466de12eef1a02efe0257cef5a931874821b4dfda47a9a869e57a38307fe24c1e0cc0be3f04e377bcf7fc3171b0bbed45539a"

RPROVIDES:${PN} += "libexmdbpp.so.0 \
libexmdbpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Shared library of czmq"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
 \
* It wraps the ZeroMQ core API in semantics that lead to shorter, \
  more readable applications. \
* It hides, as far as possible, the differences between different \
  versions of ZeroMQ (2.x, 3.x, 4.x). \
* It provides a space for development of more sophisticated API \
  semantics. \
* It wraps the ZeroMQ security features with high-level tools and \
  APIs. \
* It is the basis for other language bindings built on top of CZMQ."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "libczmq4-4.2.1-1.9.aarch64.rpm"
RPM_HASH = "8f4b3b1ba4e7dc768f566a63270f4dca478cc626e4b2f07e9eabdfb66f593a8757adee85f5efa606b8f025b0e233df4e487934386bbdf49cdb9ab06dfdc82905"

RPROVIDES:${PN} += "libczmq.so.4 \
libczmq4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libsystemd.so.0 \
libuuid.so.1 \
libzmq.so.5"

inherit rpm

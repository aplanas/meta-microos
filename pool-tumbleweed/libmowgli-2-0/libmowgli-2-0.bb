SUMMARY = "The mowgli Gen2 development framework for C"
DESCRIPTION = "mowgli is a development framework for C (like GLib) which provides \
flexible algorithms. It can be used as a suppliment to GLib to add \
additional functions (dictionaries, hashes), or replace some of the \
slow GLib list manipulation functions, or stand alone. It also \
provides a hook system and convenient logging for code, as well as a \
block allocator. \
 \
This package holds the shared library from libmowgli v2."
LICENSE = "ISC"

PV = "2.1.3"

RPM_NAME = "libmowgli-2-0-2.1.3-2.13.aarch64.rpm"
RPM_HASH = "5d3fba137e50c307930b618c1498427d4cb0894484b3b5c0a8df2b4189c5db67e68ae1d761ca48a469b64ab6e3cdbb5b490bbaf11002fc788cd93b265a096fce"

RPROVIDES:${PN} += "libmowgli-2-0 \
libmowgli-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm

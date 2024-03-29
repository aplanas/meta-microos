SUMMARY = "The development files for libmowgli v2"
DESCRIPTION = "mowgli is a development framework for C (like GLib) which provides \
flexible algorithms. It can be used as a suppliment to GLib to add \
additional functions (dictionaries, hashes), or replace some of the \
slow GLib list manipulation functions, or stand alone. It also \
provides a hook system and convenient logging for code, as well as a \
block allocator. \
 \
This package holds the development files for libmowgli v2."
LICENSE = "ISC"

PV = "2.1.3"

RPM_NAME = "libmowgli2-devel-2.1.3-2.13.aarch64.rpm"
RPM_HASH = "bb16c85f3fdc46a93f2a3f7b4621a6e8cf50a7b4c7bd47df29b4bcb60f71b57d5d5ec029ffad12f1d162ea2206b7a1eb0ca62150f50d46cc4af9ef1d275d1d5e"

RPROVIDES:${PN} += "libmowgli2-devel \
pkgconfig-libmowgli-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmowgli-2-0"

inherit rpm

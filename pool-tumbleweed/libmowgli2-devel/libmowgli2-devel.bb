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

RPM_NAME = "libmowgli2-devel-2.1.3-2.12.aarch64.rpm"
RPM_HASH = "380da2cbf00f8b5dc5cd9677d9b39d73edc4fea6c36b3135b2482c66171cd940d000e3726259d74392dab8c01ccbabae3cc01753c896cb2ce8bc234ba352c9dd"

RPROVIDES:${PN} += "libmowgli2-devel \
libmowgli2-devel(aarch-64) \
pkgconfig(libmowgli-2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmowgli-2-0"

inherit rpm

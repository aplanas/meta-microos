SUMMARY = "Library for C file functions"
DESCRIPTION = "A library for C file functions. Part of the libyal library collection."
LICENSE = "LGPL-3.0-or-later"

PV = "20220106"

RPM_NAME = "libcfile1-20220106-2.6.aarch64.rpm"
RPM_HASH = "9eeca7becf4a2730115b87d0332e18cf98ca62dc129686cf934ddb5f9744d005d388cebc4b837df0a65b3e6f687ae932dc80b8ea62896769e18d8a74eec0fa1d"

RPROVIDES:${PN} += "libcfile.so.1 \
libcfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm

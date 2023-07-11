SUMMARY = "Network Support Library (NIS)"
DESCRIPTION = "The Network Support Library for NIS was formerly part of glibc and \
is now a standalone library. The big difference is, that this library \
has support for IPv6."
LICENSE = "LGPL-2.1-only"

PV = "2.0.0"

RPM_NAME = "libnsl3-2.0.0-1.14.aarch64.rpm"
RPM_HASH = "15b0a8818d7756afdfd2a2bbc425620453216468fb4302706a18e33622abe82a5d97b54d26dbd2242bee23d6192d6a73420a75efc9b7941fb630989e035ac4ab"

RPROVIDES:${PN} += "libnsl.so.3 \
libnsl3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3"

inherit rpm

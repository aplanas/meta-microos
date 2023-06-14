SUMMARY = "FRRouting zeromq library"
DESCRIPTION = "This library contains part of the zermomq implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrzmq0-8.4-4.1.aarch64.rpm"
RPM_HASH = "afbdce18b40d55ac3bcd3d72cca0f51be7ac73ed4ee6d58f2659462ad6b6e0a193e8a2134ea29b895cde11b43b85f414362afa7b1018cd7d5108ca298ce223b0"

RPROVIDES:${PN} += "libfrrzmq.so.0 \
libfrrzmq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libzmq.so.5"

inherit rpm

SUMMARY = "FRRouting zeromq library"
DESCRIPTION = "This library contains part of the zermomq implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrzmq0-8.4-5.1.aarch64.rpm"
RPM_HASH = "7cdfae94bdd547004e882bfd0afe4a2c68e4c04c1219eec98fe9535c851570a74d3fbd47458bdaeb29f5e711eb6006abe7a3fbf894b109a888b1bc8a76133017"

RPROVIDES:${PN} += "libfrrzmq.so.0 \
libfrrzmq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libzmq.so.5"

inherit rpm

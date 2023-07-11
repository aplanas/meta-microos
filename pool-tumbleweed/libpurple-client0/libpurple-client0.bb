SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
This package provides the core libpurple client library."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-client0-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "b56b497252ad13bd893969d36ac7e4b7cc67cdb1c0fd939a790393165a3bc8a5b2df37bc84bf5321ff871a0504598dfaebcb796a04322d61d587a437df4a6849"

RPROVIDES:${PN} += "libpurple-client.so.0 \
libpurple-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0"

inherit rpm

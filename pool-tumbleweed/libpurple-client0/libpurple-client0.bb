SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
This package provides the core libpurple client library."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-client0-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "118e344370e2fb43727f9a44ba986a61b586332cc1f3bf775b815b1359a680fbc065a75bde9bbb4663cc58e6be95f671bd4aa2d8f65e2ac183448881e1cad774"

RPROVIDES:${PN} += "libpurple-client.so.0()(64bit) \
libpurple-client0 \
libpurple-client0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm

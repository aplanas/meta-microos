SUMMARY = "Library to handle pty/tty and utmp/wtmp/lastlog"
DESCRIPTION = "libptytty is an offspring of rxvt-unicode that handles \
pty/tty/utmp/wtmp/lastlog handling in mostly OS-independent ways."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "libptytty0-2.0-2.8.aarch64.rpm"
RPM_HASH = "a9d1a4489c53a0f1a793f79da634c40fb9dda27e0afb9e252e4c9681fa52096fbccc8ab6199dbc746a9c30bf0fe33bc9bc6cd6dd5c7f5ca06175540ba2d3d5c7"

RPROVIDES:${PN} += "libptytty.so.0 \
libptytty0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

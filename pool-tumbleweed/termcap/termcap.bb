SUMMARY = "The Termcap Library"
DESCRIPTION = "The termcap library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8"

RPM_NAME = "termcap-2.0.8-1047.15.aarch64.rpm"
RPM_HASH = "b01b94f50ae7b3f5263de9776b29e5d22df278d9403f70f0a85e6a34084c23f50036c9b10a0c975502ea5876e6402c2590f85a6ee1717e120544305df8e27439"

RPROVIDES:${PN} += "libcurses.so.1 \
libtermcap.so.2 \
termcap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

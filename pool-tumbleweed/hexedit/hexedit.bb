SUMMARY = "Hexadecimal editor for binary files"
DESCRIPTION = "Terminal binary file editor - edit and search hexadecimal and text. \
For the times when hexdump shows something you did not want to see."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "hexedit-1.6-1.4.aarch64.rpm"
RPM_HASH = "9dd2639ef78ca425e592bd1d46e9547f1338cd10f66475832bc884f00c5afee2caccd296f2a7dfc98208dc760719cdb2be17acad1df715069ecbc10ffae0a789"

RPROVIDES:${PN} += "hexedit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm

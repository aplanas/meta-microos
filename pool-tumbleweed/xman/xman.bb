SUMMARY = "Manual page display program for the X Window System"
DESCRIPTION = "xman is a graphical manual page browser."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "xman-1.1.5-2.4.aarch64.rpm"
RPM_HASH = "70fe2f135e63543384d94bfda436a86b15ba61ce3afe1e807284f939e05589d4645a887c6fef4729ac36abd5df30f1abfecae5cc452a61165dfa45d8d00d9925"

RPROVIDES:${PN} += "xman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm

SUMMARY = "Teletext and Videotext Decoder for the BTTV Driver"
DESCRIPTION = "AleVT is a teletext and videotext decoder and browser for the BTTV \
driver (/dev/vbi) and the X Window System.  It features multiple \
windows, a page cache, regexp searching, a built-in manual, and more. \
There is also a program to get the time from teletext."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "alevt-1.8.1-1.9.aarch64.rpm"
RPM_HASH = "168630a69c99c4599c28310ceec38a8d5597f21dca9ba4e1c450e56a30cf47cc684fe487c25f4df8af6029266841ab049a0a6b2f83f62c9a4fce9e1710da6cc2"

RPROVIDES:${PN} += "alevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libpng16.so.16 \
libzvbi.so.0"

inherit rpm

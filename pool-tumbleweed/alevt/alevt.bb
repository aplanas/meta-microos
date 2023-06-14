SUMMARY = "Teletext and Videotext Decoder for the BTTV Driver"
DESCRIPTION = "AleVT is a teletext and videotext decoder and browser for the BTTV \
driver (/dev/vbi) and the X Window System.  It features multiple \
windows, a page cache, regexp searching, a built-in manual, and more. \
There is also a program to get the time from teletext."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "alevt-1.8.1-1.8.aarch64.rpm"
RPM_HASH = "71f72d107db7080bacfbd681b49c9e96b8a15535f4b55eabc25d70e9a39add9ba2c2f4a16776890c79a217aa01ce2560be9dc71ac76f7e7c50eeccfb694a3def"

RPROVIDES:${PN} += "alevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libpng16.so.16 \
libzvbi.so.0"

inherit rpm

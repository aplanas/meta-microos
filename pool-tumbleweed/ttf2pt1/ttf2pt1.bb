SUMMARY = "True Type Font to PostScript Type 1 font converter"
DESCRIPTION = "This is a collection of tools and scripts that allow to convert True \
Type Fonts (as used by MS Wind*ws) to be converted to Postscript Type 1 \
fonts, so they can be used in X11 and Ghostscript."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "ttf2pt1-3.4.4-1.23.aarch64.rpm"
RPM_HASH = "302b86cb4ba1a26c4c036d6df28a938f17c13a80c20f678a482910decc4f395debfff837473732553636e3fc181a668696889cffdddc72fbba433f35e787de34"

RPROVIDES:${PN} += "config-ttf2pt1 \
ttf2pt1"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libm.so.6 \
t1utils"

inherit rpm

SUMMARY = "A text to postscript converter through pango"
DESCRIPTION = "paps is a command line program for converting Unicode text encoded in UTF-8 to postscript and pdf by using pango."
LICENSE = "LGPL-2.0-only"

PV = "0.7.1"

RPM_NAME = "paps-0.7.1-3.8.aarch64.rpm"
RPM_HASH = "47fdc9dd38716ce6c27c223fe0908e11c1a6d71c618d3fdca6c4cdfa64c82f705b34f434475a496a9e2ad1799ae98d5f295303553f5f454c6311ce70265bac58"

RPROVIDES:${PN} += "paps"

RDEPENDS:${PN} += "glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm

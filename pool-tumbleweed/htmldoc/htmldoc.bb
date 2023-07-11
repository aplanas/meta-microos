SUMMARY = "HTML Processor that Generates HTML, PostScript, and PDF Files"
DESCRIPTION = "HTMLDOC converts HTML source files into indexed HTML, PostScript, or \
Portable Document Format (PDF) files that can be viewed online or printed."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.16"

RPM_NAME = "htmldoc-1.9.16-1.6.aarch64.rpm"
RPM_HASH = "cbd3a9da444a15ed5fb928dd16450d325793185862172d4630cd4cfc3e386eb227352113dca099baae9d8ea84d45dda68b15c1d6afccd56ecec83e30aff3920b"

RPROVIDES:${PN} += "htmldoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXpm.so.4 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgnutls.so.30 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

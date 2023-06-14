SUMMARY = "HTML Processor that Generates HTML, PostScript, and PDF Files"
DESCRIPTION = "HTMLDOC converts HTML source files into indexed HTML, PostScript, or \
Portable Document Format (PDF) files that can be viewed online or printed."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.16"

RPM_NAME = "htmldoc-1.9.16-1.5.aarch64.rpm"
RPM_HASH = "ba7e311cf1e029cfae472cd29710e27de8945bb359c0149203070bc70dbb28f224f70c6461539c8a7755c3c960db82f71fa7ab55a1a6be60d3d2233c9f194907"

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

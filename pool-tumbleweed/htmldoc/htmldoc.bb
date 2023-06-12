SUMMARY = "HTML Processor that Generates HTML, PostScript, and PDF Files"
DESCRIPTION = "HTMLDOC converts HTML source files into indexed HTML, PostScript, or \
Portable Document Format (PDF) files that can be viewed online or printed."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.16"

RPM_NAME = "htmldoc-1.9.16-1.5.aarch64.rpm"
RPM_HASH = "ba7e311cf1e029cfae472cd29710e27de8945bb359c0149203070bc70dbb28f224f70c6461539c8a7755c3c960db82f71fa7ab55a1a6be60d3d2233c9f194907"

RPROVIDES:${PN} += "application() \
application(htmldoc.desktop) \
htmldoc \
htmldoc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libXpm.so.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfltk.so.1.3()(64bit) \
libfltk_images.so.1.3()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm

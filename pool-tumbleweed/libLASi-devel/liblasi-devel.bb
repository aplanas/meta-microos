SUMMARY = "Library to write UTF-8 strings to Postscript stream"
DESCRIPTION = "libLASi is a library written by Larry Siden that provides a C++ stream \
output interface (with operator <<) for creating Postscript \
documents that can contain characters from any of the scripts and \
symbol blocks supported in Unicode and by Owen Taylor's Pango layout \
engine. The library accomodates right-to-left scripts such as Arabic \
and Hebrew as easily as left-to-right scripts. Indic and Indic-derived \
Complex Text Layout (CTL) scripts, such as Devanagari, Thai, Lao, and \
Tibetan are supported to the extent provided by Pango and by the \
OpenType fonts installed on your system. All of this is provided \
without need for any special configuration or layout calculation on \
the programmer's part. \
 \
Although the capability to produce Unicode-based multilingual \
Postscript documents exists in large Open Source application framework \
libraries such as GTK+, QT, and KDE, libLASi was designed for projects \
which require the ability to produce Postscript independent of any one \
application framework. \
 \
This package provides the header files necessary for development with \
libLASi."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.3"

RPM_NAME = "libLASi-devel-1.1.3-4.5.aarch64.rpm"
RPM_HASH = "9a8abeeb17f5d5cd3139b22fad486a2bb3925bd99dce5a467625d65d52786050cb7ab324774b987b1a2ecd1009476d8ba04de1feb6dbdad1eb1ae4b4dfccbc08"

RPROVIDES:${PN} += "libLASi-devel \
pkgconfig-lasi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libLASi2 \
pkgconfig-freetype2 \
pkgconfig-pango \
pkgconfig-pangoft2"

inherit rpm

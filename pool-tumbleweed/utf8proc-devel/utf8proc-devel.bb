SUMMARY = "Library for processing UTF-8 encoded Unicode strings"
DESCRIPTION = "utf8proc is a library for processing UTF-8 encoded Unicode strings. \
Some features are Unicode normalization, stripping of default ignorable \
characters, case folding and detection of grapheme cluster boundaries. \
A special character mapping is available, which converts for example \
the characters “Hyphen” (U+2010), “Minus” (U+2212) and “Hyphen-Minus \
(U+002D, ASCII Minus) all into the ASCII minus sign, to make them \
equal for comparisons. \
 \
This package provides libraries and header files for developing applications \
that use utf8proc."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "utf8proc-devel-2.8.0-1.2.aarch64.rpm"
RPM_HASH = "cabdbeefd6e9eb7d6318d576574a78afbdedc262570609902602c0b50dba8ac8936c5f43685eca3e154528f6a0c5748573069f1e1d5d33a4b6ac25932e3df00e"

RPROVIDES:${PN} += "pkgconfig-libutf8proc \
utf8proc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libutf8proc2"

inherit rpm

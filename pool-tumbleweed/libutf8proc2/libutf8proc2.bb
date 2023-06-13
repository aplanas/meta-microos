SUMMARY = "Library for processing UTF-8 encoded Unicode strings"
DESCRIPTION = "utf8proc is a library for processing UTF-8 encoded Unicode strings. \
Some features are Unicode normalization, stripping of default ignorable \
characters, case folding and detection of grapheme cluster boundaries. \
A special character mapping is available, which converts for example \
the characters “Hyphen” (U+2010), “Minus” (U+2212) and “Hyphen-Minus \
(U+002D, ASCII Minus) all into the ASCII minus sign, to make them \
equal for comparisons."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "libutf8proc2-2.8.0-1.2.aarch64.rpm"
RPM_HASH = "2e4ab0aceba07fc8ede5d29566d53956e2c2173c58eca74eb2c82342e3dffdf34e9ba38058ed576172842e875159c35a18046f9767caa6e470d037a635151db9"

RPROVIDES:${PN} += "libutf8proc.so.2()(64bit) \
libutf8proc2 \
libutf8proc2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

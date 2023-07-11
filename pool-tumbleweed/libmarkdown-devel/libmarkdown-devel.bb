SUMMARY = "Markdown text to HTML converter library"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.0a"

RPM_NAME = "libmarkdown-devel-3.0.0a-1.2.aarch64.rpm"
RPM_HASH = "1ef651308a12eceeb256c0b47d41318615e7c3595d4f20ca7e152dc15b090d3c4bba2e40b8d9f00c257925c36b4dfce23be9385abcbe6f8be7a1669549a2f4f5"

RPROVIDES:${PN} += "libmarkdown-devel \
pkgconfig-libmarkdown"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmarkdown3"

inherit rpm

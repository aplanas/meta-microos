SUMMARY = "Markdown text to HTML converter library"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.0a"

RPM_NAME = "libmarkdown3-3.0.0a-1.2.aarch64.rpm"
RPM_HASH = "58a3b62d6245937fc26c545525909b2b1b185ad266b4d3fb65e8f4d64ad85938f85b7e36acc6bcb734eac60990abf7304e4296449ef3d27e45d164c1905c672e"

RPROVIDES:${PN} += "libmarkdown.so.3 \
libmarkdown3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

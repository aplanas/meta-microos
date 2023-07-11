SUMMARY = "Markdown text to HTML converter"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.0a"

RPM_NAME = "discount-3.0.0a-1.2.aarch64.rpm"
RPM_HASH = "c34ea3f9bbe1007495b19c63a4ff4ccca2d7faaa11ff004ef397370942f8da57b18dbce9060eecec497fed69861b55b5beb520c4a138a767b7f7442d529abd02"

RPROVIDES:${PN} += "discount \
markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmarkdown.so.3 \
update-alternatives"

inherit rpm

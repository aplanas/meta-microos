SUMMARY = "Markdown text to HTML converter"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.0a"

RPM_NAME = "discount-3.0.0a-1.1.aarch64.rpm"
RPM_HASH = "a8d3b807b8e9878e83a94db9be9d77c2c1edf3989592a168cb092241da15bb1855e1548b194c739f9691c009ef0ec737c584ca711937a71ad753ec19ecec6383"

RPROVIDES:${PN} += "discount \
markdown"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmarkdown.so.3 \
update-alternatives"

inherit rpm

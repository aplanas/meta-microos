SUMMARY = "DocBook-to-Texinfo Converter"
DESCRIPTION = "A new tool based on Perl modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.8"

RPM_NAME = "docbook2x-doc-0.8.8-127.14.aarch64.rpm"
RPM_HASH = "8c4687e52b29be2b900789479669ead0dc45d2264518a59c728d2f974f25c3020e9a8dd1bb9a0ddb90f74d27374254baffafde3e6cae2308f3ca9d8ca9c0aa76"

RPROVIDES:${PN} += "docbook2x-doc \
docbook2x-doc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm

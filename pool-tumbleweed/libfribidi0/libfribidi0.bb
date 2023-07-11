SUMMARY = "An implementation of the Unicode BiDi algorithm"
DESCRIPTION = "This library implements the algorithm as described in 'Unicode \
Standard Annex #9, the Bidirectional Algorithm, \
http://www.unicode.org/unicode/reports/tr9/'. FriBidi is \
tested against the Bidi Reference Code and, to the best of the \
developers' knowledge, does not contain any conformance bugs. \
 \
The API was inspired by the document 'Bi-Di languages support - BiDi \
API proposal' by Franck Portaneri, which he wrote as a proposal for \
adding BiDi support to Mozilla."
LICENSE = "LGPL-2.1-only"

PV = "1.0.13"

RPM_NAME = "libfribidi0-1.0.13-1.1.aarch64.rpm"
RPM_HASH = "fed5b12ecc0b03213135ccab27eb4b26a449f26936d2177b029b15eb1990f820b47c58db626538c1eddc5e376da5a69e419fc14c86beff5fabdba4b8a9580174"

RPROVIDES:${PN} += "libfribidi.so.0 \
libfribidi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

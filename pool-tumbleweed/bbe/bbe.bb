SUMMARY = "Binary Block Editor"
DESCRIPTION = "bbe is a sed-like editor for binary files. Instead of reading input in \
lines as sed, bbe reads arbitrary blocks from an input stream and performs \
byte-related transformations on found blocks."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "bbe-0.2.2-3.14.aarch64.rpm"
RPM_HASH = "59c96087ba1f52d49024ca45f667c123de04339b7b66d5087ed987347d51b409c3ee982c582a3eef7ac58cb1db5318c40cba261afa71f6fc313c0cddbc46dcc7"

RPROVIDES:${PN} += "bbe \
bbe(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
info \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

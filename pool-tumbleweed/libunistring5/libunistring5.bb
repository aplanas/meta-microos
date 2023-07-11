SUMMARY = "GNU Unicode string library"
DESCRIPTION = "This portable C library implements Unicode string types in three flavours: \
(UTF-8, UTF-16, UTF-32), together with functions for character processing \
(names, classifications, properties) and functions for string processing \
(iteration, formatted output, width, word breaks, line breaks, normalization, \
case folding and regular expressions)."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "libunistring5-1.1-2.2.aarch64.rpm"
RPM_HASH = "fee800264b2266669c3af9013737427e9a830bd0f8eb92e5ab4ac0593dd3f804f2ff7bac0563ed7bdde0d95b5658dab8eb55f34653c7a17f41dfa545e558b354"

RPROVIDES:${PN} += "libunistring.so.5 \
libunistring5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

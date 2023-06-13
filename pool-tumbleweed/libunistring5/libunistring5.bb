SUMMARY = "GNU Unicode string library"
DESCRIPTION = "This portable C library implements Unicode string types in three flavours: \
(UTF-8, UTF-16, UTF-32), together with functions for character processing \
(names, classifications, properties) and functions for string processing \
(iteration, formatted output, width, word breaks, line breaks, normalization, \
case folding and regular expressions)."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "libunistring5-1.1-2.1.aarch64.rpm"
RPM_HASH = "d5df4dde1cb97c71761c961fb53353e2ab8045719b573b90f589f9fd7c9e2d48beefab974e23d37c3664127db90b6caa05b96d38949ca3f41c1627a86bac3c6a"

RPROVIDES:${PN} += "libunistring.so.5()(64bit) \
libunistring5 \
libunistring5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

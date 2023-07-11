SUMMARY = "Two-way braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. New \
languages can be added through tables that support a rule- or \
dictionary-based approach. Math braille (Nemeth and Marburg) is \
supported."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis20-3.25.0-1.2.aarch64.rpm"
RPM_HASH = "4b1614ca5ff18cfdd572472592f746c084fbc0847417341c24b16614cf22ed54d85e5377c0e09c0971c3f7c18a88678ca80191dc7ad645bc4777ddd6b2cc1575"

RPROVIDES:${PN} += "liblouis \
liblouis.so.20 \
liblouis20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblouis-data"

inherit rpm

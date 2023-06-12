SUMMARY = "Development files for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. New \
languages can be added through tables that support a rule- or \
dictionary-based approach. Math braille (Nemeth and Marburg) is \
supported."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-devel-3.25.0-1.1.aarch64.rpm"
RPM_HASH = "3b419cf4802c1610df3bcd5b228dc5cb1b5093f30e7ac06c5558802f1aae65806f0b0303ae95d98dc6b4416d9316f40dba64c63b452d45b9411a92bb853dc11b"

RPROVIDES:${PN} += "liblouis-devel \
liblouis-devel(aarch-64) \
pkgconfig(liblouis)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblouis20"

inherit rpm

SUMMARY = "Development files for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. New \
languages can be added through tables that support a rule- or \
dictionary-based approach. Math braille (Nemeth and Marburg) is \
supported."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-devel-3.25.0-1.2.aarch64.rpm"
RPM_HASH = "90ef73c77bf8ed0ab1f54fd26bab704be273b03ab880d624e3d969542ba46aace06b91b3875fe4b440a9b451f367d2853f2655d8ab28b9f514a1caa4dba00f36"

RPROVIDES:${PN} += "liblouis-devel \
pkgconfig-liblouis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblouis20"

inherit rpm

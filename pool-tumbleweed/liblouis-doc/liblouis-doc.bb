SUMMARY = "Documentation for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-doc-3.25.0-1.2.aarch64.rpm"
RPM_HASH = "f29cfc37a4cd6a5283b3665b6ca8383beb489d3aa0c9ea4215b17cdd574b8c0315a152d183f8d81f69d1a707b75ebaef19afd33130f0b4c3dea3599838d5ca9d"

RPROVIDES:${PN} += "liblouis-doc"

RDEPENDS:${PN} += ""

inherit rpm

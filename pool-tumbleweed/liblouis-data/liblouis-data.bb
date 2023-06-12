SUMMARY = "Data files for the liblouis two-way braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. \
 \
This package contains data required by main package."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-data-3.25.0-1.1.noarch.rpm"
RPM_HASH = "bcc066ca92b48481ac81108161da943d5ada48cc71978ee111472d679f736a9a0242ae21b744a60339400ead3136b1dd2ffe50d13ab7d8b317c7ba598f3b71db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblouis-data"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Data files for the liblouis two-way braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. \
 \
This package contains data required by main package."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-data-3.25.0-1.2.noarch.rpm"
RPM_HASH = "48a40df6c2534abcf9e208af9ca7aca244b19db955111b340cc37466435fdabf6976a9c677a2a72901cc5aef98e1fe34e241a78b3ed9042c58afa9afc77bb600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblouis-data"

RDEPENDS:${PN} += ""

inherit rpm

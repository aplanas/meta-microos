SUMMARY = "Optional Fonts for Ghostscript"
DESCRIPTION = "A miscellaneous set including Cyrillic, \
kana, and fonts derived from the free \
Hershey fonts, with improvements (such as \
adding accented characters) by Thomas Wolff. \
The Hershey-based fonts are quite different \
from traditional printer or display fonts; \
you can read about them in more detail in \
the documentation on Hershey fonts."
LICENSE = "GPL-2.0-only"

PV = "9.06"

RPM_NAME = "ghostscript-fonts-other-9.06-13.10.noarch.rpm"
RPM_HASH = "5c8506c0a91b760646cbe5530c3b00ed5a3e7fb37a9f3fad6964dd7a4e6624910be574812d5bc26dfcba78ff2e99cf68a6b0b2a5b5a98f9371283323d3d15431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostscript-fonts-other"
RDEPENDS:${PN} += "/bin/sh \
ghostscript-fonts-std"

inherit rpm

SUMMARY = "Catalan localization files for LibreOffice"
DESCRIPTION = "Provides Catalan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ca-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "f950f5c62c215a8a660524f59b75bf4242f290727784942fe1c2823d126f33c53510c228701b51a4bf05c35f9453989ca858755c4c88cd90a782c85b33d2c4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca \
libreoffice-l10n-ca \
locale-libreoffice-ca"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca"

inherit rpm

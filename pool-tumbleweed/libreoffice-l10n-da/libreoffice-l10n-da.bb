SUMMARY = "Danish localization files for LibreOffice"
DESCRIPTION = "Provides Danish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-da-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "706f88d185a094f4ea60fd9a62f273a7168f046271a29e03eba563aa5ad900ae8697fae8add61f379e1777ddde9769dc5b1ad1d0b0e6a170394f3609fdf44876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-da \
libreoffice-l10n-da \
locale-libreoffice-da"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-da-DK"

inherit rpm

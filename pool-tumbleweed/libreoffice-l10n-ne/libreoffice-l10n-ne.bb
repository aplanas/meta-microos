SUMMARY = "Nepali localization files for LibreOffice"
DESCRIPTION = "Provides Nepali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ne-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "96d8bda4fd7e87aaaf3eeced2575eb481eee97f3b43f0be84704acdaedbef3adf1c497479315643089a1bf2299e48a1ea67a44b20fcf09a81ef6b53912677f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ne \
libreoffice-l10n-ne \
locale-libreoffice-ne"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ne-NP"

inherit rpm

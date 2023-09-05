SUMMARY = "French localization files for LibreOffice"
DESCRIPTION = "Provides French translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-fr-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "ca837850c3d0ac4ab0b1fbe4269d3e0d98e3b6535754eb1b34b8b0e6846e762b41e175cfbd43f6165caa9b4110f0f7a1a0de44510faffed6c97f36a705b7fdc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fr \
libreoffice-l10n-fr \
locale-libreoffice-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-fr-FR"

inherit rpm

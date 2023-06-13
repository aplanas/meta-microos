SUMMARY = "Arabic localization files for LibreOffice"
DESCRIPTION = "Provides Arabic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ar-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "7226716f4be5aa84da4b69e9c56af8c7aa20c948185b6d8660db807faab268fa105872c3943d820ffab0274922a5e23e093de87410a7757fe3b938b021135934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ar \
libreoffice-l10n-ar \
locale(libreoffice:ar)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ar"

inherit rpm

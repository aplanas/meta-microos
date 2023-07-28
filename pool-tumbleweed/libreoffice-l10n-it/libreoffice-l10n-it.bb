SUMMARY = "Italian localization files for LibreOffice"
DESCRIPTION = "Provides Italian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-it-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "11995d5bb47150216ed6286ae5e88f6c2200566d920e206a2796257a494df573dfcae9c466d7f2d225416724c5b3cadd1a09400e9205472f36216b32387eaf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-it \
libreoffice-l10n-it \
locale-libreoffice-it"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-it-IT"

inherit rpm

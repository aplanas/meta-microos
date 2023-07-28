SUMMARY = "Odia localization files for LibreOffice"
DESCRIPTION = "Provides Odia translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-or-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "ef3561359d23ae055ffe333051747c5651fd81d5a9b975ebb5dbb36dfe66043a9e02c241566cd91dbf9322b27264f4ff1b5ab7df6aed66e9da01154ab4b474f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-or \
libreoffice-l10n-or \
locale-libreoffice-or"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Odia localization files for LibreOffice"
DESCRIPTION = "Provides Odia translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-or-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "04eceb587c4c47e536273997ea8f7b8bf9e58eeb40155131376345ad0cd2c10130166ce8f75966e744636b404a48b0c0efc0d2c9b8e794a826822537605094d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-or \
libreoffice-l10n-or \
locale-libreoffice-or"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

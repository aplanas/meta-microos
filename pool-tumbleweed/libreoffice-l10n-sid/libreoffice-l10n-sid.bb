SUMMARY = "Sidamo localization files for LibreOffice"
DESCRIPTION = "Provides Sidamo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sid-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "e81cb6313a52690f56bf6ec4bfd191af69820e0f5f658e8d90e279e385278a496f66ed473984eb1cc355b6e7dcdfaeb3b9a4de6f2505323680795c035254c985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sid \
libreoffice-l10n-sid \
locale-libreoffice-sid"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

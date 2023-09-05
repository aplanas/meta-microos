SUMMARY = "Esperanto localization files for LibreOffice"
DESCRIPTION = "Provides Esperanto translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-eo-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "57f361b2b9b4e47d849d6ba955630af981cd8cbd9524155db3b08c8d290030581cf00be4152698a18c44476fd33a0c3804e6c238a07ae02e5a9ff6a36ca89fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eo \
libreoffice-l10n-eo \
locale-libreoffice-eo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

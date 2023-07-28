SUMMARY = "Spanish localization files for LibreOffice"
DESCRIPTION = "Provides Spanish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-es-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "ed1ffb0be34ecf1919f23eac9a80474e8e4200a42768dde98a4493fff2540609fdf2b1310ec846fa71c9da9a268f931dad1175383e1c9be244954f5d7a9b6bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-es \
libreoffice-l10n-es \
locale-libreoffice-es"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-es"

inherit rpm

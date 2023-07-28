SUMMARY = "Malayalam localization files for LibreOffice"
DESCRIPTION = "Provides Malayalam translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ml-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "b405b1c5337b93848fbe24070946fd817b31134538711024b5a12b7db4c294dd637a211df22c96708f9281754e654f4d7834f3a20f0ebd39f0ca491376b907cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ml \
libreoffice-l10n-ml \
locale-libreoffice-ml"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

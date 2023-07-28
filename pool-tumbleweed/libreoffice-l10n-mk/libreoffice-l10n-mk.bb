SUMMARY = "Macedonian localization files for LibreOffice"
DESCRIPTION = "Provides Macedonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mk-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "f9e8804708f98f90cd396a16d99a6c02ebc129776ef383ddc16469b78393d250dae4ace82378d8990caea154dab1c6ee911e1c476b6d19a6fad1d8fb5221a7a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mk \
libreoffice-l10n-mk \
locale-libreoffice-mk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

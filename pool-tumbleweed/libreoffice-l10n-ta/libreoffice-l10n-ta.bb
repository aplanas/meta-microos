SUMMARY = "Tamil localization files for LibreOffice"
DESCRIPTION = "Provides Tamil translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ta-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "5def88e66bcfb890c122bb664be3cfacebcbb7fa4f4c58f658d50091dcad5ff6bed6b5338daf1685f15f233ced1e2e1b3121d6272de009daee11e4680f80b358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ta \
libreoffice-l10n-ta \
locale-libreoffice-ta"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

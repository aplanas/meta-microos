SUMMARY = "Nynorsk localization files for LibreOffice"
DESCRIPTION = "Provides Nynorsk translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nn-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "1381448146cf41a0205d424f9daeb34d5f489b773c7df6b17dd915ee88c3964cc4d836baeb1bfe49ae852935d03660a52dcf2a9ec50f947e1d844c296d03b121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nn \
libreoffice-l10n-nn \
locale-libreoffice-nn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nn-NO"

inherit rpm

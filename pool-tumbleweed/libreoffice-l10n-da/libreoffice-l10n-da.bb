SUMMARY = "Danish localization files for LibreOffice"
DESCRIPTION = "Provides Danish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-da-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "3c18c681e181927117510b82067a6a36fd68e2cd98d872d95267860b89a00afbe12e8ebb7aa25c40e98c965f025ee9aa518d3d25f3a592a0bffeb0f6467ad7c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-da \
libreoffice-l10n-da \
locale-libreoffice-da"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-da-DK"

inherit rpm

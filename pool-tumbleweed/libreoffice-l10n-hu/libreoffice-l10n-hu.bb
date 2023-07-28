SUMMARY = "Hungarian localization files for LibreOffice"
DESCRIPTION = "Provides Hungarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hu-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "0205380761c96ce6e6eddc4827f6d9f31a7328308c7d0a6a8829a8c403b93ac956ad883f7a5bab94626d67e29fa35c8c40f2a6749d76af82c2c13964ca6645df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hu \
libreoffice-l10n-hu \
locale-libreoffice-hu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hu-HU"

inherit rpm

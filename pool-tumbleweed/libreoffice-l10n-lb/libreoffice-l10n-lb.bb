SUMMARY = "Luxembourgish localization files for LibreOffice"
DESCRIPTION = "Provides Luxembourgish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-lb-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "5db61b7af3fa1d05e24e7779fef434ecbe3be01fe4143eaa288b7f609c6e8f6bb05b65944e98084f53404495130bec9336fce0ea5bcdcc92cc5d142228dffe0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lb \
libreoffice-l10n-lb \
locale-libreoffice-lb"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Oromo localization files for LibreOffice"
DESCRIPTION = "Provides Oromo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-om-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "448b0cef1290b17fc4eab2f862abe94648d92fc0ec43994569fb50e7628cdc8b1873f7f32058d4329cea4e5b8b2cd314ab87098c5e9d0054d4f5745e8314d13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-om \
libreoffice-l10n-om \
locale-libreoffice-om"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

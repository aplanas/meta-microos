SUMMARY = "Punjabi localization files for LibreOffice"
DESCRIPTION = "Provides Punjabi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-pa-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "4444611ec1ce72d4460ddb6703ad75901f7869ec0dd067fbdabbe6dc363ccfe43bc1e9848f8326d360df6b023071922bb1adc6a481d5174f6008e3675d166ced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pa \
libreoffice-help-pa-IN \
libreoffice-l10n-pa \
libreoffice-l10n-pa-IN \
locale-libreoffice-pa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

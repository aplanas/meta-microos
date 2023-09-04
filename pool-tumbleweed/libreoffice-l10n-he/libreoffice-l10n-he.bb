SUMMARY = "Hebrew localization files for LibreOffice"
DESCRIPTION = "Provides Hebrew translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-he-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "8849a685d4fda6ba865c838e29498a274a0a4ea3b7176b4f32dd64ba55d3729dc82176292d2baebe528d6c0b1f8e3002565a35e295123fc626c6b1e00f98002c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-he \
libreoffice-l10n-he \
locale-libreoffice-he"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-he-IL"

inherit rpm

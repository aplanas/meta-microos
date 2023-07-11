SUMMARY = "Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kmr_Latn-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "75673d0021128fa6fa36edc77ec39ded93aba7e8c896215f0f1839ba14c047b2130c77056bbbc440b9e2f2b835a26594b9f7fabc5add307e683867be1571909c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kmr-Latn \
libreoffice-l10n-kmr-Latn \
locale-libreoffice-kmr-Latn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-kmr-Latn"

inherit rpm

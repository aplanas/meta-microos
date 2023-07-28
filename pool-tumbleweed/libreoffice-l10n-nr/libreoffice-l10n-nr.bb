SUMMARY = "Southern_Ndebele localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Ndebele translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nr-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "2d5d752d82410474428f012268b20af7bd2902a326977a99ac1c2cc3f7aec347a6feca85135d83c1d579570e46edf992d0362141419be912186581b5df4a22ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nr \
libreoffice-l10n-nr \
locale-libreoffice-nr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

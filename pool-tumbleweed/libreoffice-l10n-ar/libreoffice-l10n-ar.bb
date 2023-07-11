SUMMARY = "Arabic localization files for LibreOffice"
DESCRIPTION = "Provides Arabic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ar-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "caa3685117872edd3afc3f5816b6eae195880b962a4ad6df8381c4f01646f69372ab4f86906366ea8b09d81190105c89200a1e3f4925ad03fa5d56ecbf0be058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ar \
libreoffice-l10n-ar \
locale-libreoffice-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ar"

inherit rpm

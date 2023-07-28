SUMMARY = "German localization files for LibreOffice"
DESCRIPTION = "Provides German translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-de-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "a0e6de360cfa79efd6dff3cc470b85a783affdc3ff24aa882fd76f57c5d8d4325e3d64cb46582725ff19899a6b7077b0190238c8cd957796fa855a255d67e1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-de \
libreoffice-l10n-de \
locale-libreoffice-de"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-de"

inherit rpm

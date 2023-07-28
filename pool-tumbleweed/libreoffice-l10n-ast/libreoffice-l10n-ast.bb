SUMMARY = "Asturian localization files for LibreOffice"
DESCRIPTION = "Provides Asturian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ast-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "57c9f9e1d2568bd31af5d774d8a0f88a34fa362956665bb91fb45b9d17853e97fb3e0db9b8815ae56b18c7345177ae6dc7e20502996bcc099ac31f820debcab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ast \
libreoffice-l10n-ast \
locale-libreoffice-ast"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

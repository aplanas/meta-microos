SUMMARY = "Bulgarian localization files for LibreOffice"
DESCRIPTION = "Provides Bulgarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bg-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "650f1951771fc08f77348585d8be979f9a0d9c23518ce1212a483181b86a12699f6abc742c43520fdbff4814dc875a961cb323f268ce2d738a4f75ec52a45050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bg \
libreoffice-l10n-bg \
locale-libreoffice-bg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bg-BG"

inherit rpm

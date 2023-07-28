SUMMARY = "Brazilian_Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Brazilian_Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pt_BR-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "7eb73b294cf7a83de6f7ecc43fac844a3ef1ff20f0b25c4ddae121a1f90b72d15be907913ef906a8ad77534b15e8cfe55fc6892e00a12b1ee2ba46d3374d4bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt-BR \
libreoffice-l10n-pt-BR \
locale-libreoffice-pt-BR"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-BR"

inherit rpm

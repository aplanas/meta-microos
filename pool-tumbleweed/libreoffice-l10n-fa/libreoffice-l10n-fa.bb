SUMMARY = "Farsi localization files for LibreOffice"
DESCRIPTION = "Provides Farsi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fa-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "81af9f32225f18cb701205572bd5442e56a5164419d7c72d79781b123d25f134ca3f5d30978b5917b68ea93714b3bc0c51bd29e924c4c07e458cad7dfb33be5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fa \
libreoffice-l10n-fa \
locale-libreoffice-fa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

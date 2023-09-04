SUMMARY = "Finnish localization files for LibreOffice"
DESCRIPTION = "Provides Finnish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-fi-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ff105502951bf20626b66851e1f1a20a56fc9a2039f3adb97c2380ca89a12ebe6044b922289a5fa044596329be371a31255902e41e7773e4e286a2e6d33a1e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fi \
libreoffice-l10n-fi \
locale-libreoffice-fi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
libreoffice-voikko"

inherit rpm

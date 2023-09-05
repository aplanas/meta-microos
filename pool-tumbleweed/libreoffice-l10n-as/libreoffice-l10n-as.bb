SUMMARY = "Assamese localization files for LibreOffice"
DESCRIPTION = "Provides Assamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-as-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a9b58efc81664297825897301698db907c51bee3dd104123ee8be3f64aedb2b463ced20a714fcbc5e9c4a7558fde598253419719d2d67c02cda9b858896fb56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-as \
libreoffice-l10n-as \
locale-libreoffice-as"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

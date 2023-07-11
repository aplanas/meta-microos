SUMMARY = "Luxembourgish localization files for LibreOffice"
DESCRIPTION = "Provides Luxembourgish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lb-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "3b6671a33b5bf2c0ffc8688e1b9edff07ec17b944ae920e2778012ba52c2a814a80a22c118ba67f824700ed5edc348a05809033f506828ee57c2bcf3e28c27b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lb \
libreoffice-l10n-lb \
locale-libreoffice-lb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

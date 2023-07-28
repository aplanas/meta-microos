SUMMARY = "Kabyle localization files for LibreOffice"
DESCRIPTION = "Provides Kabyle translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kab-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "295e50c04d0f4be7e02582b6420547ef7def913f46cba26ea4fa22ae619862277869b87716e719b8627435f903311b5d4f3344402e5152eb95c46dba3bd8f2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kab \
libreoffice-l10n-kab \
locale-libreoffice-kab"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

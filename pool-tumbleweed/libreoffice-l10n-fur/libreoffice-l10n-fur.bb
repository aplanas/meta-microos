SUMMARY = "Friulian localization files for LibreOffice"
DESCRIPTION = "Provides Friulian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-fur-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "4047866720c8b8821af87f87dd9740c35ed261b36564e1c44dd1d77e643d12dfb715c07da82a6a7230fbfcbb532126e3608df248ab6f6105c979e31e6c4d369c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fur \
libreoffice-l10n-fur \
locale-libreoffice-fur"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

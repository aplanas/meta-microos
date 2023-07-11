SUMMARY = "Northern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Northern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nso-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "c95f12b3729c29ae48c397503ddbf3995f0e14031a67deda6779c9ce66f24cd592e27e851f7700d0c195089a732958c883d41f9d1afa4e2fa116c89fc55d9c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nso \
libreoffice-l10n-nso \
locale-libreoffice-nso"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

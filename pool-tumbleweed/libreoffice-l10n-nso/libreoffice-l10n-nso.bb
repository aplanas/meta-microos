SUMMARY = "Northern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Northern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-nso-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "ee4271d80c682207d6c5d4865f0a27bf30ab6ae0fdca755ad242acd96ca86d41da1ad5f14135ef552686896cefa583d49b8f494b0df1665c2a14d0b19fcb77a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nso \
libreoffice-l10n-nso \
locale-libreoffice-nso"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

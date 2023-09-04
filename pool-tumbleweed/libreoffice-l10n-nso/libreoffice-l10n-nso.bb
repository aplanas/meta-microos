SUMMARY = "Northern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Northern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-nso-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "d45443c00ae4cd3c66c87cb655c608259a95b0662ab35ab7c6cab6898a2394afa7cb159022612a845d7f03086c19dd0393dc8408f798bdf6238cfa65e7423dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nso \
libreoffice-l10n-nso \
locale-libreoffice-nso"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Arabic localization files for LibreOffice"
DESCRIPTION = "Provides Arabic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ar-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "0c8a84f4aa866a86557f88f7f43f49c41718e08467164b8b0a98702da78d40b7ccf463a38e814051acba30d216ba6b28979647fae22c0e49c7fa8c7f4c9a2a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ar \
libreoffice-l10n-ar \
locale-libreoffice-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ar"

inherit rpm

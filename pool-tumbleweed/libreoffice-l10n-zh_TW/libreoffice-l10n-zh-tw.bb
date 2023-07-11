SUMMARY = "Traditional_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Traditional_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-zh_TW-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "9069f2bc6d6e4320ade857e902056c705a0fcadd01df7ddb39624da33757a1a636173f79966e098699f5984ad277c60a165a871d115e312d99ee7170e81b4384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-Hant \
libreoffice-help-zh-TW \
libreoffice-l10n-zh-Hant \
libreoffice-l10n-zh-TW \
locale-libreoffice-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

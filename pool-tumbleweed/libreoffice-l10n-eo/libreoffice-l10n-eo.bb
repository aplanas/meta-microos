SUMMARY = "Esperanto localization files for LibreOffice"
DESCRIPTION = "Provides Esperanto translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-eo-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "597d8cbd3de824a1d1d1295e300043f5568a917e6fe08c458b334bc49a70bf081913dcdd22341f0d53159d0d55a463e84df4ad5892d086c601eae814c9107f6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eo \
libreoffice-l10n-eo \
locale-libreoffice-eo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Esperanto localization files for LibreOffice"
DESCRIPTION = "Provides Esperanto translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-eo-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "30fb2fc4d2267e282cdb63a6a4ca406f340bc7443597b85372a62a40197658d4d2ebb4fd8242f7d5403ce1c4875a71d6c802b59bbaa9e501f42b066439423bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eo \
libreoffice-l10n-eo \
locale-libreoffice-eo"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

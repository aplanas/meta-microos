SUMMARY = "Frisian localization files for LibreOffice"
DESCRIPTION = "Provides Frisian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fy-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "d7ca1dd89293e1b791fa791a649d30f876a026432277cd842cca2e9c02450006280c37bd2fe3a3922bd266378378e5a613da981bdec55a707956bc06890220dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fy \
libreoffice-l10n-fy \
locale-libreoffice-fy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

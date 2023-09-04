SUMMARY = "Irish localization files for LibreOffice"
DESCRIPTION = "Provides Irish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ga-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ecab87b9e63a5b0e2e856aeddb9230e9cf4d3090b1d9f93bec47ef21cd2fc0acc67a112b7ab7c9dcafc2e65a0c70c681486bdf7cb7f39ffb479fb315ecdb6c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ga \
libreoffice-l10n-ga \
locale-libreoffice-ga"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Marathi localization files for LibreOffice"
DESCRIPTION = "Provides Marathi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mr-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "c52aaf1f3ad17a7ae2faf93e2d080bc88464646ba941b3c8abac9500ad05a643f50f3d20013e62f13c94c6e54dd9fd7aa31ba4add26ad3561c1e9e86dd3a36a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mr \
libreoffice-l10n-mr \
locale-libreoffice-mr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

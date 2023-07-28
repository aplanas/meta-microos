SUMMARY = "Kashmiri localization files for LibreOffice"
DESCRIPTION = "Provides Kashmiri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ks-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "3a3b1abf0d15f76bb72aedfb0df44460028b03249177cc50155819e08bd052bead9e065f99c6acdf5a3a76f68b453908b265f092aeca6e676daae4b7d357d2d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ks \
libreoffice-l10n-ks \
locale-libreoffice-ks"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

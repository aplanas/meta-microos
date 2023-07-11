SUMMARY = "Bosnian localization files for LibreOffice"
DESCRIPTION = "Provides Bosnian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bs-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "72453a00edc55ddcfd7f250ac8249e2d43768aa5606d9849462c355f3fa5279c99f865172a6a00b7cdcc7e7b196ecd5fab6f46dbfa5c6558e0fd76bb97915bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bs \
libreoffice-l10n-bs \
locale-libreoffice-bs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

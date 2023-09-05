SUMMARY = "Kashmiri localization files for LibreOffice"
DESCRIPTION = "Provides Kashmiri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ks-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "be3377e2f2a026880f83518c3c0b051cd3ccc07d56d22878ae8a7f0b59963d9132b0f6067acb8de6d4b046c1112da4327b9c0e7c654078801b02ef746e03fa6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ks \
libreoffice-l10n-ks \
locale-libreoffice-ks"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

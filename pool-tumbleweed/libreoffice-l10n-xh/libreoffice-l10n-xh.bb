SUMMARY = "Xhosa localization files for LibreOffice"
DESCRIPTION = "Provides Xhosa translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-xh-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "102aedb82a5e8b23d689b6c28ac5332d2f8c275a278a293702bf8bcce07adbc77dad9774406f51ae5b497524e8c1c36e36f693285645ef3a7bb491b5e38ac4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-xh \
libreoffice-l10n-xh \
locale-libreoffice-xh"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

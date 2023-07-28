SUMMARY = "Burnese localization files for LibreOffice"
DESCRIPTION = "Provides Burnese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-my-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "888f38e586a06e43aa56d912f467aff2692fa267245f280f91f78f08a27af718b3ed4497bc7b92c9e0cf792c10406dc141eb7182b114ea8affc777dff803805b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-my \
libreoffice-l10n-my \
locale-libreoffice-my"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

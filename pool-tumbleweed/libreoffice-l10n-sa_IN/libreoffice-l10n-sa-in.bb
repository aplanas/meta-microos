SUMMARY = "Sanskrit localization files for LibreOffice"
DESCRIPTION = "Provides Sanskrit translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sa_IN-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "2f55d09ad98a3fe7883cde007dd28a3d95a9ebd7f0163c839b258e703c004ef36591a5856b06e6b239acc02ff09d7fc34f7be4747fd9b5f205b334d73f681609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sa-IN \
libreoffice-l10n-sa-IN \
locale-libreoffice-sa-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

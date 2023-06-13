SUMMARY = "Xhosa localization files for LibreOffice"
DESCRIPTION = "Provides Xhosa translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-xh-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "40c3ce1eb5b178134dd887bf631b94bc916938bc68bd529cd20fd9e579cb2e9771c79c81188c56833009cdd9ed1bc11991d5e76bedcf4110214070a19eb46ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-xh \
libreoffice-l10n-xh \
locale(libreoffice:xh)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

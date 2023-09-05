SUMMARY = "Southern_Ndebele localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Ndebele translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-nr-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "89f6128a77813fc3661c4ef12924a2698ade0fa9ffcf4d7e52468d4de913603e5195beeae13e23c321966aa3fa18ce0945e5d8c79ace12e66c1c2b00685bc7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nr \
libreoffice-l10n-nr \
locale-libreoffice-nr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

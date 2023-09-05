SUMMARY = "Support for creating LibreOffice dialogs in glade"
DESCRIPTION = "libreoffice-glade contains a catalog of LibreOffice-specific widgets for \
glade and ui-previewer tool to check the visual appearance of dialogs."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-glade-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "ea8f070da16ef9dde686e47c6b4de6e4ec1a5747d36b015a6b9584431a0345cdd7a1eae0bc1d7394881f0e63a1fa433a6473da01c422cf23b1ca494e3135cfa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-glade"

RDEPENDS:${PN} += "libreoffice"

inherit rpm

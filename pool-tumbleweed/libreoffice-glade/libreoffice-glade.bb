SUMMARY = "Support for creating LibreOffice dialogs in glade"
DESCRIPTION = "libreoffice-glade contains a catalog of LibreOffice-specific widgets for \
glade and ui-previewer tool to check the visual appearance of dialogs."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-glade-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "206aa090ef5fad9eabeb93572174138913e35f5bf2589ef2a4eabbcd3c18060acd7c0004ed7514c0b9bdbdc3800e53f23c0dbcad81916c8f894fc92516438102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-glade"

RDEPENDS:${PN} += "libreoffice"

inherit rpm

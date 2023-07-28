SUMMARY = "Support for creating LibreOffice dialogs in glade"
DESCRIPTION = "libreoffice-glade contains a catalog of LibreOffice-specific widgets for \
glade and ui-previewer tool to check the visual appearance of dialogs."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-glade-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "3257848614ced7b89dde2aba079461bb0550d79e5df4237b2a561f23beda5d987f3ce1343cc1f94cca6bf60aa536578a06edc2a3f41d5ee9785a05ddc269c95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-glade"

RDEPENDS:${PN} += "libreoffice"

inherit rpm

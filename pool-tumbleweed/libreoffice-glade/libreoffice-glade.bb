SUMMARY = "Support for creating LibreOffice dialogs in glade"
DESCRIPTION = "libreoffice-glade contains a catalog of LibreOffice-specific widgets for \
glade and ui-previewer tool to check the visual appearance of dialogs."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-glade-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "a3995befaa26b088ce1eb999e43155f9626c8c86ec0596ac47438368ca4507058987f6ac77344ab30608cfac3ae7ed86fbb297e15ee76fa2d84df68d2e953dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-glade"

RDEPENDS:${PN} += "libreoffice"

inherit rpm

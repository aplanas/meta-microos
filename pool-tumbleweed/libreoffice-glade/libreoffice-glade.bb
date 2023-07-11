SUMMARY = "Support for creating LibreOffice dialogs in glade"
DESCRIPTION = "libreoffice-glade contains a catalog of LibreOffice-specific widgets for \
glade and ui-previewer tool to check the visual appearance of dialogs."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-glade-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "cafe13d67dabacbfb8fdafe49e13918af1069608c30196300713f25a2529ff4f15a4a207f06a02a7c93db4bdac4579d8d749c17d5e380b9fa0ffa0dbed4bff1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-glade"

RDEPENDS:${PN} += "libreoffice"

inherit rpm

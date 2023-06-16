SUMMARY = "Slovenian localization files for LibreOffice"
DESCRIPTION = "Provides Slovenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sl-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "75b86a791a306e1b082bd55e87b3cbb0ae89aef720fcc58b2c06625fcb4620b77a68325730452522b555094564f10bc95877bc146afd7a8d6bcff7cfbe75d71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sl \
libreoffice-l10n-sl \
locale-libreoffice-sl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sl-SI"

inherit rpm

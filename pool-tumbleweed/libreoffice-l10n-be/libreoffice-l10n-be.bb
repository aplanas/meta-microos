SUMMARY = "Belarusian localization files for LibreOffice"
DESCRIPTION = "Provides Belarusian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-be-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "c9f3295c62588919f46f45f63c6430cb726a95f3e259e2d0c9b4eeebcbf28afc3765cb695886f77366568233bc3dccd2edacd815ea6905da796eb72ad2f9cf25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-be \
libreoffice-l10n-be \
locale-libreoffice-be"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-be-BY"

inherit rpm

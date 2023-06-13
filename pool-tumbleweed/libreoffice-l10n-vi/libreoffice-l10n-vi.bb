SUMMARY = "Vietnamese localization files for LibreOffice"
DESCRIPTION = "Provides Vietnamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-vi-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "5f6daf2b42a8d497cbfb5414992870ce1c8ee46decb4c25db2117d317e8fc13f44d7e179a5de40f58337e2fad74f958e4a33acd0e7b0905f83a5993793490906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vi \
libreoffice-l10n-vi \
locale(libreoffice:vi)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-vi"

inherit rpm

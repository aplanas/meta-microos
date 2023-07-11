SUMMARY = "Dutch localization files for LibreOffice"
DESCRIPTION = "Provides Dutch translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nl-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "c371a4cb3e73bf3c9b64b1322314f69e1298b2ffc3dc12ace0588be26a1cc7ee2913c139d03b6795f5ac4d2571fe48e4958a097dbc5eb98dc9d67871b40baa09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nl \
libreoffice-l10n-nl \
locale-libreoffice-nl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nl-NL"

inherit rpm

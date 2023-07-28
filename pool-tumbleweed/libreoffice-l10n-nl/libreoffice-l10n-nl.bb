SUMMARY = "Dutch localization files for LibreOffice"
DESCRIPTION = "Provides Dutch translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nl-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "00a1e40275e66094709cabc62bc873757ef5407915e7678c94429a72516d21cee3c49070eaa151da0e58047391f75613893f25c9f7dd1eb88c720d1cf29d6d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nl \
libreoffice-l10n-nl \
locale-libreoffice-nl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nl-NL"

inherit rpm

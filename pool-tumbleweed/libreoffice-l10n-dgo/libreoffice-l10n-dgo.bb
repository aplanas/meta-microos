SUMMARY = "Dogri localization files for LibreOffice"
DESCRIPTION = "Provides Dogri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-dgo-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "2cb8e161ee01336d1524f474171191b5f26bdbb20bc54661a666e40edcbeba29088248dbcb0a3bdf75dc85da5b710c0584dd35e1d7560f15bb7cf52e202dc9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dgo \
libreoffice-l10n-dgo \
locale-libreoffice-dgo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

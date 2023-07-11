SUMMARY = "German localization files for LibreOffice"
DESCRIPTION = "Provides German translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-de-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "915b35f9eccc5056ce05c5e503ff562f0e84f8631c74a6edd7f20484640dcf8a85b447738ef6c0db61e0ddc3a5e5d1d58a8e5ea65dfaa50f19093ddef4763ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-de \
libreoffice-l10n-de \
locale-libreoffice-de"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-de"

inherit rpm

SUMMARY = "Slovak localization files for LibreOffice"
DESCRIPTION = "Provides Slovak translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sk-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ffcfbd25dcfe73d2d71542e620a74c28f51af840f853645330613900a9e7a7405306643cccdb2eeffeede1da5561be90a5b5d6a9166bca7dbd801075bb5f16b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sk \
libreoffice-l10n-sk \
locale-libreoffice-sk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sk-SK"

inherit rpm

SUMMARY = "Bengali localization files for LibreOffice"
DESCRIPTION = "Provides Bengali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-bn-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ced8aa9b6ff79fde498b9778e586dc5e084e34992b3a69c30e145dfa1889c01d10aed9d41989a3e89559af0dc10d0f5a0444d620c53168a5a3cde6407eaf4428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn \
libreoffice-l10n-bn \
locale-libreoffice-bn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-BD"

inherit rpm

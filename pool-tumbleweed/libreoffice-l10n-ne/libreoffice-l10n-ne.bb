SUMMARY = "Nepali localization files for LibreOffice"
DESCRIPTION = "Provides Nepali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ne-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "20252fdfc1de0037e2d0d7cf6b15df0b4a7c9b1608bbbd218ae52ca5ad1b6f2b00e357b6e26f3613cd6899ca8f71a2eea538e208f8f2c450be5eaa21d2d5356f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ne \
libreoffice-l10n-ne \
locale-libreoffice-ne"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ne-NP"

inherit rpm

SUMMARY = "Swedish localization files for LibreOffice"
DESCRIPTION = "Provides Swedish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sv-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "236729ad6dd87e7a7bb57663810e426295d5d864d5f0938c561a4fa2f3776ce6b9de432cc4b32ab1051c8385d1af37c6fd64c7f2b4291d5d79c665770cbeca3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sv \
libreoffice-l10n-sv \
locale-libreoffice-sv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sv-SE"

inherit rpm

SUMMARY = "English_GB localization files for LibreOffice"
DESCRIPTION = "Provides English_GB translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-en_GB-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "bc8e05ff5b175d6fd14451a6c01c651f6f60187213f69abfe9950e8b9433f02e9d9351052c1614bc1cac72245dd053f0f0dea83cb79a40ae9a1a6f5755c4c25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-GB \
libreoffice-l10n-en-GB \
locale-libreoffice-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-GB"

inherit rpm

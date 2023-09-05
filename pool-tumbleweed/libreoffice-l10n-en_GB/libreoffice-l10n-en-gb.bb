SUMMARY = "English_GB localization files for LibreOffice"
DESCRIPTION = "Provides English_GB translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-en_GB-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "c7cdab7e66dcb4f8c7db209e48da2ceeefdc65078c1b59fa6b15f61a2d3b5a3be1d2f74cf1732f399343196087efb52508f5694192cc7a02b07f55fc2fe4e124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-GB \
libreoffice-l10n-en-GB \
locale-libreoffice-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-GB"

inherit rpm

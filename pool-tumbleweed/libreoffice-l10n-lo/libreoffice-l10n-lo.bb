SUMMARY = "Lao localization files for LibreOffice"
DESCRIPTION = "Provides Lao translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lo-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "f6706bd97a5e81ee06dede01a5dc19084507ff07644a6c7b0c85418c4420606f717b15336f74c292ff29184be53da3d5e25d84e9ae196c9327299097419b18ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lo \
libreoffice-l10n-lo \
locale-libreoffice-lo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lo-LA"

inherit rpm

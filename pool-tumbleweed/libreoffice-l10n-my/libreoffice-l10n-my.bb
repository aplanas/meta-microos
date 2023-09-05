SUMMARY = "Burnese localization files for LibreOffice"
DESCRIPTION = "Provides Burnese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-my-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "0add192756a94f0ae142b9116734f9ef99164245ef56ecdd00f435457502e77addb6f6a406cc490374255cb3c0a822be7c5129d2008df0fdeb0c6b18d8bd19dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-my \
libreoffice-l10n-my \
locale-libreoffice-my"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

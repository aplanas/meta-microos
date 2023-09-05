SUMMARY = "Tsonga localization files for LibreOffice"
DESCRIPTION = "Provides Tsonga translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ts-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "39b004b7fdb33875a311a0e6a5b7dedd2b9cc1615f68a3742d59451d6ba0abd63564cd2ece2fa2c15e3b5015dc700d8ae05a4304f1dd012b89bdabfa919341f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ts \
libreoffice-l10n-ts \
locale-libreoffice-ts"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

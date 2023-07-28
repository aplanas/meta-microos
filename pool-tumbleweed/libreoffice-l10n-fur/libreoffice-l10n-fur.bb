SUMMARY = "Friulian localization files for LibreOffice"
DESCRIPTION = "Provides Friulian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fur-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "23b680c0ba81bd75b00002c0d54030936283bfbc50175596b08b3ef5558ec1741be3448361a742584e341ceb37b2e09c6b07b7f1a8c957706fe4ce1c20515263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fur \
libreoffice-l10n-fur \
locale-libreoffice-fur"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

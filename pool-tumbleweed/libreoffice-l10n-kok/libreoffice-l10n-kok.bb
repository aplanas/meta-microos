SUMMARY = "Konkani localization files for LibreOffice"
DESCRIPTION = "Provides Konkani translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-kok-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "bb402c64075a662b9d421013e192e3c572217b6f031d5a3f1f519f8f098ea8e4b9b3cfd1c17a0d8c252ffc36d58999db7c5a49e4c30e5e6a32f02638da08093b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kok \
libreoffice-l10n-kok \
locale(libreoffice:kok)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Korean localization files for LibreOffice"
DESCRIPTION = "Provides Korean translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ko-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f15740afdd6363492ad3a1bc3e582910fb413d0e141250326fd2157ea21c9ab1aeea25ca97041d49069c953bab52dcc90d57b6ef9bea32f6b9f761fc276b59c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ko \
libreoffice-l10n-ko \
locale(libreoffice:ko)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

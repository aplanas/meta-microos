SUMMARY = "Maithili localization files for LibreOffice"
DESCRIPTION = "Provides Maithili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-mai-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "5b0eec86cc31886b24bf86fbb0769de53adfc8d6bb15c8d201b6e8d0fb3a2a90dfae897b7438d520a35f7e5c054b25e5010cdcb13a0213aeed5f466f6db6312b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mai \
libreoffice-l10n-mai \
locale-libreoffice-mai"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Finnish localization files for LibreOffice"
DESCRIPTION = "Provides Finnish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-fi-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "78f772eebca2b8e461d2344aeb53cba9ff1266d9e88e051f84f0239609baaa321e44a2022d0e4c1663cf966be4e7f1597fa098b75a162900857b18d888b0d8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fi \
libreoffice-l10n-fi \
locale-libreoffice-fi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
libreoffice-voikko"

inherit rpm

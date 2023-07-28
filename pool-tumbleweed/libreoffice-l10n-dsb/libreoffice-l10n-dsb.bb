SUMMARY = "Lower_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Lower_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-dsb-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "0c09cd231e6f1798c7ea1c8ff4878a5e78c5df4ea3762dc3149041c541bc5cb62059e28a0e16214ecb7ebd92de58c4bc52a7336cfbd45813f35aea4e6b05f32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dsb \
libreoffice-l10n-dsb \
locale-libreoffice-dsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

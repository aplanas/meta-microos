SUMMARY = "Upper_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Upper_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-hsb-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "08f895df8cc4abd71645f901a4b3b51f7151ae70d0e692bd8742cc2d2e93fec463180ca16e5dfb5cdba16259a1440de891d2b5b1abc6851e92f77bcf79f0b6cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hsb \
libreoffice-l10n-hsb \
locale-libreoffice-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

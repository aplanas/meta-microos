SUMMARY = "Danish localization files for LibreOffice"
DESCRIPTION = "Provides Danish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-da-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "b79377364177d244e8da84269322dc4055359ea7f3e090b6d33ad02475beb140e62b92bdea6ef0c5790b0a7856a0a3ea185984dc1c1456349bd93800808022a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-da \
libreoffice-l10n-da \
locale(libreoffice:da)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-da_DK"

inherit rpm

SUMMARY = "Southern_Ndebele localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Ndebele translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nr-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "5e573f391f965a7d1e7a143fd6ffc7597e12dea371c35c7d5615912398a2d92f0b110fb8857836e66a8828e500037afa1d583e98cc420931ca9d7a74a61aad89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nr \
libreoffice-l10n-nr \
locale-libreoffice-nr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Kashmiri localization files for LibreOffice"
DESCRIPTION = "Provides Kashmiri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ks-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "780b255303e6b349e084726c1f916e78edb1c2db9d796f72db9cb0d52191413470daf8f4194b0dcf7dffb8da10c7970f9954eb4cbde1c5250633666961ce420c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ks \
libreoffice-l10n-ks \
locale-libreoffice-ks"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Dzongkha localization files for LibreOffice"
DESCRIPTION = "Provides Dzongkha translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-dz-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "aa757b97b0ddd929f6c0859b191552023a248af9f60c44c112cddc30eaa2b2029df2e37751040ef202a670842f8af582ea6cb23472a4b7261da3bb3e7472e16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dz \
libreoffice-l10n-dz \
locale-libreoffice-dz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

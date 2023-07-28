SUMMARY = "Maithili localization files for LibreOffice"
DESCRIPTION = "Provides Maithili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mai-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "ac75009b3338378132723941212ffbbfd9e15ca3e2355a6224f3db2cff24d7583c1f6d5a1c264cfb4fbeac097e332e72646aa2f0342fc9674cce454967ef8057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mai \
libreoffice-l10n-mai \
locale-libreoffice-mai"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

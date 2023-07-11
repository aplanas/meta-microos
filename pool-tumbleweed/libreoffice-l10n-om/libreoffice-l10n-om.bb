SUMMARY = "Oromo localization files for LibreOffice"
DESCRIPTION = "Provides Oromo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-om-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "54562d5745b936f66e931d4f10897126a37e0f2486ab768556275291c9c3ea5f52523e29051ca00fc33c0a23d7abf9097ef157f7e6cb1eda9ca3f2cd6c14af33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-om \
libreoffice-l10n-om \
locale-libreoffice-om"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

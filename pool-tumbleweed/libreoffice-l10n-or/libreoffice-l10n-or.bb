SUMMARY = "Odia localization files for LibreOffice"
DESCRIPTION = "Provides Odia translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-or-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9b5fb926c54572039e49d6f93066e1d012735bb6e2097a531c8ec7ea190b79c32dea9d753ead87de0437cd54f8e0bf8ef26a2a75e9c1e79f279b78cd03e92183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-or \
libreoffice-l10n-or \
locale-libreoffice-or"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

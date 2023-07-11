SUMMARY = "Odia localization files for LibreOffice"
DESCRIPTION = "Provides Odia translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-or-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "e6f693ebbca45c70d3d1bcc523658b6d2ac0a9734a56d750926362ab96cdda73aee6abc51a464b78276fcc71c533b12717380f76831826ef5dd95a55f5e8d346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-or \
libreoffice-l10n-or \
locale-libreoffice-or"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Estonian localization files for LibreOffice"
DESCRIPTION = "Provides Estonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-et-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "a1ac9ad2a2a08e107bfeec825517adbaf6c6ae77bad8f1922ed3b2e70574dd41af46417bed46b187667c588333f7faff65a22668f6e692339fd81ff038317e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-et \
libreoffice-l10n-et \
locale-libreoffice-et"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-et-EE"

inherit rpm

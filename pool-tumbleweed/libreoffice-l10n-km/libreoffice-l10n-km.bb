SUMMARY = "Khmer localization files for LibreOffice"
DESCRIPTION = "Provides Khmer translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-km-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9113e64dad0cfe226e22d1e74c6764fb720f3937d7e852156920b9458e8394fd57abe88461fe51ce808fb225b6258d97a0af6e2f45ddb03f1c7864df420ff702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-km \
libreoffice-l10n-km \
locale-libreoffice-km"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

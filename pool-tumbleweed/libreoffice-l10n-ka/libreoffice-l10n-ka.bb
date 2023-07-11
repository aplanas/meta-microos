SUMMARY = "Georgian localization files for LibreOffice"
DESCRIPTION = "Provides Georgian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ka-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "726301b460f008fd975ad363fe9de3cc4848adac401fc5b659840b9e60bffa679c6de815372a24a00d5e0eedf39e99f8bd5e8b2b8ad3b666386c5916f9c61077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ka \
libreoffice-l10n-ka \
locale-libreoffice-ka"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Lower_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Lower_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-dsb-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "42dfac6f2bac128aa2e1eb96cfc61d1123da27c65150f22863c1f9c573a40d2b228d954f1729807aa8a85dcb1acc9221787bf06bcb0ad5dbd4205669e8592e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dsb \
libreoffice-l10n-dsb \
locale-libreoffice-dsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

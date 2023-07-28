SUMMARY = "Upper_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Upper_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hsb-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "2e88ce59bb4475ee715fa1a62e5b86ad0dc72a24338ce8c7745b49d5d33b71dd2479b5f7753482e76e5544daa910ed58e2449a9fc375255a85dcdfd40d899459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hsb \
libreoffice-l10n-hsb \
locale-libreoffice-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

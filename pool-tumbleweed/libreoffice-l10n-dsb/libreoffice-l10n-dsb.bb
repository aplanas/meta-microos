SUMMARY = "Lower_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Lower_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-dsb-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "0447a8cf9ff5fe8f84dc4bb2c8d6f6ac55d0d3706cc5c91a200964e22d3bf2d1c2cbad27d8ea768f9f52748214a5efd83030d8eca7ebcacca4f33f0d0df56b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dsb \
libreoffice-l10n-dsb \
locale-libreoffice-dsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

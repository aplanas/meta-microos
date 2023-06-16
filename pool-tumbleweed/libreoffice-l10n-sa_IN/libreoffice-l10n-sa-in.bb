SUMMARY = "Sanskrit localization files for LibreOffice"
DESCRIPTION = "Provides Sanskrit translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sa_IN-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "2e26ebff46f60e0ae58e11356e2dfee040b5bf7a6481e09154c1f8dcab7a93d3ac3870cf2e268aa12c06ba274dfbdfd2726d258e9817d1b705c4ed77e8772592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sa-IN \
libreoffice-l10n-sa-IN \
locale-libreoffice-sa-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

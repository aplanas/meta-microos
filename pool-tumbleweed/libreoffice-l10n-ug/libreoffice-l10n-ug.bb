SUMMARY = "Uyghur localization files for LibreOffice"
DESCRIPTION = "Provides Uyghur translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ug-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "2f4c7ccaf73112dfc229171dc2cf9acb11168b8c1358f9a5103815026d51ee6f3c55bc500b877b3d2327cf59fb96d172bd84e8c1916ec0b8c318ed424fccd7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ug \
libreoffice-l10n-ug \
locale-libreoffice-ug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Malayalam localization files for LibreOffice"
DESCRIPTION = "Provides Malayalam translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ml-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "291539c631b599c6003ab849aab266b5bea0cbd32e89c7f5357f85cfafdf701af924b9e58f84e2868515c2ae60ac61433c6993a131f1c151f8412e1dc57eae25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ml \
libreoffice-l10n-ml \
locale-libreoffice-ml"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

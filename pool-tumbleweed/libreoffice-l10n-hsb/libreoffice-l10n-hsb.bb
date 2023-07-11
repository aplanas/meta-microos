SUMMARY = "Upper_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Upper_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hsb-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "04273b2013cab2dc9748e189a76c59422fbaa38463c3c1128b53886550f5c40ff8f5204b435e6cea05abcb03b18bee13e1b058c42ff0435f61a024144ed9b2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hsb \
libreoffice-l10n-hsb \
locale-libreoffice-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

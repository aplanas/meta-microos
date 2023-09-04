SUMMARY = "Albanian localization files for LibreOffice"
DESCRIPTION = "Provides Albanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sq-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9f113ac9bc603a45bcfdb4bdfe2a30cb733975dce3500f47f399dec587167ec6814f9f493f0986bcc09f19b944ed9c103cd82174bd7b10b9694bae21fbaa5dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sq \
libreoffice-l10n-sq \
locale-libreoffice-sq"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sq-AL"

inherit rpm

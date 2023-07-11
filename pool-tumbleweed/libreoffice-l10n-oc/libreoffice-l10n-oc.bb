SUMMARY = "Occitan localization files for LibreOffice"
DESCRIPTION = "Provides Occitan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-oc-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "857b6ced3bfb2fd6f6c1eb4b5b3381cadb8d77514b5188e028639e56c478e0e33696e6dc6a970bdeae395071c3fc5eb254c42b9b04e38755ed389ff4156834be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-oc \
libreoffice-l10n-oc \
locale-libreoffice-oc"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-oc-FR"

inherit rpm

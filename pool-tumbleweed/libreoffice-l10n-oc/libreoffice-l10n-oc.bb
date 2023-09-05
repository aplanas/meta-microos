SUMMARY = "Occitan localization files for LibreOffice"
DESCRIPTION = "Provides Occitan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-oc-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "2cb12c1f9559916b165dbfcb74a0564c9cefd9b0b6a937695af27ba064dd791ef2b22c30eb872e62f3fcbe48be5b1c86ff4d6500c90ce9a67b667e7e1ce0a64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-oc \
libreoffice-l10n-oc \
locale-libreoffice-oc"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-oc-FR"

inherit rpm

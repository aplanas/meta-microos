SUMMARY = "Occitan localization files for LibreOffice"
DESCRIPTION = "Provides Occitan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-oc-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "f0d01669cdae04d677a24dfdd4d6284a8aac2d81cce24888e52dc812e48434b3e3bb4fd1916d67728c43e14af75bd5b4b81d8f2f2767bda2212c85a508e815a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-oc \
libreoffice-l10n-oc \
locale-libreoffice-oc"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-oc-FR"

inherit rpm

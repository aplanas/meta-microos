SUMMARY = "Indonesian localization files for LibreOffice"
DESCRIPTION = "Provides Indonesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-id-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "66010b474657b65883ac96fc49f39a2ddcfc7223414015abaae0cda7dc435a4e6fd76de0b568d2daea489b5b3918bc3470a1c91ddc5f05c0c969cfd3edce17bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-id \
libreoffice-l10n-id \
locale-libreoffice-id"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-id"

inherit rpm

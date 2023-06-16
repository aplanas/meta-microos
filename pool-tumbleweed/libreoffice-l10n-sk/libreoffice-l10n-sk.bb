SUMMARY = "Slovak localization files for LibreOffice"
DESCRIPTION = "Provides Slovak translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sk-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e24b3eb86ccadcfb4e0ae1191faf32643f9f3c5e015593f0ca3050eaa5a7476e164c89c73c93abbcccedc80c8f13dbce7dfebcb794aa3125b661b9f7989a1935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sk \
libreoffice-l10n-sk \
locale-libreoffice-sk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sk-SK"

inherit rpm

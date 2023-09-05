SUMMARY = "Albanian localization files for LibreOffice"
DESCRIPTION = "Provides Albanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sq-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "310108ff773faff7639b01844be7c0443a3dfe15e77e7221c991b04b75c0aaa695274f19fd04248b483caefaddee5b6e8f96e591e704cbacf21bb8acdc6a99a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sq \
libreoffice-l10n-sq \
locale-libreoffice-sq"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sq-AL"

inherit rpm

SUMMARY = "Latvian localization files for LibreOffice"
DESCRIPTION = "Provides Latvian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-lv-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "865507b3bf34221e9dc35307b1644dfdecf84814ea88fda98c8d15462511bfd37b241fab3a94a0bfbdabbe24fee2d7ce0fb53fd1c3fb3434cb7c75675eb520d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lv \
libreoffice-l10n-lv \
locale-libreoffice-lv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lv-LV"

inherit rpm

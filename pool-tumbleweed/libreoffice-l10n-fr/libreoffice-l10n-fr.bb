SUMMARY = "French localization files for LibreOffice"
DESCRIPTION = "Provides French translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fr-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "a3340d0da7809cdb60139247ff0806d2b0e086caf2ec4ea5aeaa4984cb742f562024c648488dd54b1f45efde76f8bdd9878bee21aaa1a97a1ef573e784ac53aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fr \
libreoffice-l10n-fr \
locale-libreoffice-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-fr-FR"

inherit rpm

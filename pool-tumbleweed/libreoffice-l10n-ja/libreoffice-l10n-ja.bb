SUMMARY = "Japanese localization files for LibreOffice"
DESCRIPTION = "Provides Japanese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ja-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ef2c6b187f459dd82901f3a26bfd755621ae2e8eaef328880106f1b72b6d5cd99d3eea452a8a6f73e996f3197328228d2872f948f17f13ef00ca415f348a7bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ja \
libreoffice-l10n-ja \
locale-libreoffice-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Gujarati localization files for LibreOffice"
DESCRIPTION = "Provides Gujarati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-gu-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "4f5573d672f1737f1aa5f0dee48ef8e6427151fb54a37c91f85dd52b5de93b2a23dae39880a2d2652e4ff0e72763d2a925932040ba42d9bde4c4bb719011c1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gu \
libreoffice-help-gu-IN \
libreoffice-l10n-gu \
libreoffice-l10n-gu-IN \
locale-libreoffice-gu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gu-IN"

inherit rpm

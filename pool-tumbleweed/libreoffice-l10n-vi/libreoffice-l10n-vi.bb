SUMMARY = "Vietnamese localization files for LibreOffice"
DESCRIPTION = "Provides Vietnamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-vi-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "af4a07a6832d819ec5de062eb0cd5786f9373e9fab3294af17277f989e0cde29ac087d13e914848cdf45c6efc2b3fda095a81d4375b9e3231f60918201ea7c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vi \
libreoffice-l10n-vi \
locale-libreoffice-vi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-vi"

inherit rpm

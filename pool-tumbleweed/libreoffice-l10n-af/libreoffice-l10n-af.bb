SUMMARY = "Afrikaans localization files for LibreOffice"
DESCRIPTION = "Provides Afrikaans translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-af-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a67c95b3f3c2c89a6889b9130915cf1ee1d400c774338a603f344e8264f2d0c0b8014302b78c3cf59745db6fb08ebf14dd97b064e53911bddd1b2fd67aad6d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-af \
libreoffice-l10n-af \
locale-libreoffice-af"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-af-ZA"

inherit rpm

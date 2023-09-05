SUMMARY = "Catalan localization files for LibreOffice"
DESCRIPTION = "Provides Catalan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ca-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a3d9a3439ad9068957c53875ddd11c24e5caaeb0bff87daa2d930fa67d6d5781ba216cc6df7b4c04935aec4129c2561cb2f53993c304a803959fc2422977d637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca \
libreoffice-l10n-ca \
locale-libreoffice-ca"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca"

inherit rpm

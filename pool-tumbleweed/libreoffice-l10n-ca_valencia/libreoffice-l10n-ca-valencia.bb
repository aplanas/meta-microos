SUMMARY = "Valencian localization files for LibreOffice"
DESCRIPTION = "Provides Valencian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ca_valencia-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "3ba036c98bc8ba373ac19d9315fa11238006690e69c90f1e469bf272df04b2631fe9813d92a4fa6c943bf13b28ff4699da5dc53e031ae145b4a6e39a5e2837be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca-valencia \
libreoffice-l10n-ca-valencia \
locale-libreoffice-ca-valencia"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca-ES-valencia"

inherit rpm

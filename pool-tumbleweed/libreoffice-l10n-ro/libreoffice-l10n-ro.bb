SUMMARY = "Romanian localization files for LibreOffice"
DESCRIPTION = "Provides Romanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ro-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "0fa7568c19e0feaf350fb9781b2c07e0faebfb56c5e7b59a0f7991d80ae8b09b4461e66a4e6a338376a52d48fb42e6eb918f87a28ef2302777bf84623ad17a4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ro \
libreoffice-l10n-ro \
locale(libreoffice:ro)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ro"

inherit rpm

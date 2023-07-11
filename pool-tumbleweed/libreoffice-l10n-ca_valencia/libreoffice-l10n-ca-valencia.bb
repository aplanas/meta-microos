SUMMARY = "Valencian localization files for LibreOffice"
DESCRIPTION = "Provides Valencian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ca_valencia-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "900573cae0d640af43c6db01b208b4d58bf012c79f93d66195d38c894865d518e71236e6d9b16b5847db8f0a194004d29f81214afaa3b8be56a712da2ec5dfe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca-valencia \
libreoffice-l10n-ca-valencia \
locale-libreoffice-ca-valencia"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca-ES-valencia"

inherit rpm

SUMMARY = "Breton localization files for LibreOffice"
DESCRIPTION = "Provides Breton translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-br-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "d4f9cb5c5b0b84409e468df48555fbe1d9201dc185fd1a333433c0da4914afae604375c104c9d58d2bf9c7ffa775552f9a7ca05808d0442b60379471996e5653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-br \
libreoffice-l10n-br \
locale-libreoffice-br"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-br-FR"

inherit rpm

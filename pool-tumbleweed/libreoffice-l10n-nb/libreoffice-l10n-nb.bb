SUMMARY = "Bokmal localization files for LibreOffice"
DESCRIPTION = "Provides Bokmal translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nb-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "b4dab635319afc0466a467f6b71ab60f1ffde291a640c9c16ac5557411d058fb7160e6c3912e389b93c3b9f612d78b8f7052449b5b988cea7d7393859343d092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nb \
libreoffice-l10n-nb \
locale-libreoffice-nb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-no"

inherit rpm

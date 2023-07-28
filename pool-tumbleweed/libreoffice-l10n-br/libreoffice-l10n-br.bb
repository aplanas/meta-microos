SUMMARY = "Breton localization files for LibreOffice"
DESCRIPTION = "Provides Breton translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-br-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "0fcef8fc7bd16a77cdcb6da9499a90292e35975c1df550289168e4d9ac5cbe4f3fe5ccf0147767af0e0bf0e02fb17c96f825ec4a992457090dd477fd405e155e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-br \
libreoffice-l10n-br \
locale-libreoffice-br"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-br-FR"

inherit rpm

SUMMARY = "Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-pt_PT-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "2269c6b0a2d06e1b16d506c8e5024f73db39362657016630f545854e42c6aa6fa3422c69f03edf451eebca5e2f72229f53ae0bdee08de4143ed28272694a0d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt \
libreoffice-help-pt-PT \
libreoffice-l10n-pt \
libreoffice-l10n-pt-PT \
locale-libreoffice-pt-PT"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-PT"

inherit rpm

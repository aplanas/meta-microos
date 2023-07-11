SUMMARY = "Hebrew localization files for LibreOffice"
DESCRIPTION = "Provides Hebrew translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-he-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "89abe3bf613fb8cfffb7b806f9431b3acba75b8d05a1efb77007a807c35dbe9e57e3a40a78322cbb136232a65d84fe7a5fbbb3ec804ef629b619d79f987e8b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-he \
libreoffice-l10n-he \
locale-libreoffice-he"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-he-IL"

inherit rpm

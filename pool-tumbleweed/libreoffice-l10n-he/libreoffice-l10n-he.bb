SUMMARY = "Hebrew localization files for LibreOffice"
DESCRIPTION = "Provides Hebrew translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-he-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "ca72b9cec89bf53a469b262d2b95f47b3df56f988367f090aa84b3e6bc38cc79e1470ce6d6fd8c7ac9d849c449972ec062e23102a8196c0bb7b160b15acb3d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-he \
libreoffice-l10n-he \
locale-libreoffice-he"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-he-IL"

inherit rpm

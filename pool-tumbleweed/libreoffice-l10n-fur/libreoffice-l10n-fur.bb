SUMMARY = "Friulian localization files for LibreOffice"
DESCRIPTION = "Provides Friulian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-fur-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "4ddb225898dbedf2df4e7e4bd0f95e8d0acad6fd75e0a01e62dbe204a334137455c881d908fd95e81788a7b12c310ee50cafe0e4cdbae64045abcbc54db6dc3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fur \
libreoffice-l10n-fur \
locale-libreoffice-fur"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

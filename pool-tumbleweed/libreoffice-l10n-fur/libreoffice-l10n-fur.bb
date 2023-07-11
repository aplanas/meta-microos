SUMMARY = "Friulian localization files for LibreOffice"
DESCRIPTION = "Provides Friulian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fur-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "c7444a9c8554d787cac3b60b3ea647bb0a0afa6e746072f556eb0959396caff664052f4b8cbe3bf72ec7663ee82d99f39c698b459112626dc459e72fae8bb853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fur \
libreoffice-l10n-fur \
locale-libreoffice-fur"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

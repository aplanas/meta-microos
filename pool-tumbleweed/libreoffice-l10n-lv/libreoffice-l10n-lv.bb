SUMMARY = "Latvian localization files for LibreOffice"
DESCRIPTION = "Provides Latvian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-lv-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "9c04638021a2d0dbe2a3e31a89017c472092c93bfedc71e7a07a8863f02bc1d92b0a4993cb7e69a9675146539d302c3a7921b81a7a908710087ad0eee2118ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lv \
libreoffice-l10n-lv \
locale-libreoffice-lv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lv-LV"

inherit rpm

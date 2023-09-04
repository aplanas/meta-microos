SUMMARY = "Lithuanian localization files for LibreOffice"
DESCRIPTION = "Provides Lithuanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-lt-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "852f52dab9828e77a75425b30cd55e8202683381cbcbcdea04993558eeb8f44318977765f557c8e31619447de64cce9911953f38513997f5f321cb1326968abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lt \
libreoffice-l10n-lt \
locale-libreoffice-lt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lt-LT"

inherit rpm

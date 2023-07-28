SUMMARY = "Assamese localization files for LibreOffice"
DESCRIPTION = "Provides Assamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-as-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "3e5c95324047fc65b4fc05c1332654fecab77d7bfc3b5f0a7e4f3c4ce46735a85fac8545794c3be759ac73e6ccfd90399c7c2383e41a44f674409382bbc1b745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-as \
libreoffice-l10n-as \
locale-libreoffice-as"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

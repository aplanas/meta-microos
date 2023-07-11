SUMMARY = "Latvian localization files for LibreOffice"
DESCRIPTION = "Provides Latvian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lv-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "69ea2a3a1e2cda4223f4589a7c6eab33c0ead893c06c7b68598e75da768ce42804a6a3466efef9ba4a61f617a5e2cedd40fa222980a7407c4ea61471b55bcc94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lv \
libreoffice-l10n-lv \
locale-libreoffice-lv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lv-LV"

inherit rpm

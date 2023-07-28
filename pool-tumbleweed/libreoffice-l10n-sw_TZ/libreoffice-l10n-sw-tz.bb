SUMMARY = "Swahili localization files for LibreOffice"
DESCRIPTION = "Provides Swahili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sw_TZ-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "03335444e08daf430a2fc922cdfaed03b8ebcb5cd655c5cd9d16f6722e0723e874462cc62773b639318d404f5d38477039f02a06f29725c61bdaca017b0153cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sw-TZ \
libreoffice-l10n-sw-TZ \
locale-libreoffice-sw-TZ"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sw-TZ"

inherit rpm

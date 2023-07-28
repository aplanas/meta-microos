SUMMARY = "Korean localization files for LibreOffice"
DESCRIPTION = "Provides Korean translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ko-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "cfe135db3385eb390724a5000f9604d3cde5a388e061875e356e5a200160fa02dad045225d9b583eb3e83fb09b791f0892ff3af1cf34e7bd3f372f48190a1319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ko \
libreoffice-l10n-ko \
locale-libreoffice-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

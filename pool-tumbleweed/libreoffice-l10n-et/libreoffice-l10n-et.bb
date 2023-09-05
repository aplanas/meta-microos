SUMMARY = "Estonian localization files for LibreOffice"
DESCRIPTION = "Provides Estonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-et-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "64d155c3f9f283d256d65b1e44d3a64f1f5186d176dce9bf2f2d743ade3def104bead01d4e0b0f9c3efd33925faff3c34a8f29b191eb2250a18fa54fd9fb4f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-et \
libreoffice-l10n-et \
locale-libreoffice-et"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-et-EE"

inherit rpm

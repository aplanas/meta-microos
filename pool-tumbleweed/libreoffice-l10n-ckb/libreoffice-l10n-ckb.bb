SUMMARY = "Central_Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Central_Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ckb-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "3b254f3a8a27dc5e07f11b576b459c80b5833d33e4b707086a620119e82bbb8c0cf3ebe826ff8902e07c2f2781d11667e42f86e4bf07e3a09706d652b1115b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ckb \
libreoffice-l10n-ckb \
locale-libreoffice-ckb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Central_Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Central_Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ckb-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ea86f0840b1ff38d0fa6e3879da082f10d4e8525a5a44fdd99e5c44cf9ddcbbafcb2cdff40d0e7948f7622247c1c119e183f91ffd1b2ab2ed2cd5dbf54f52f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ckb \
libreoffice-l10n-ckb \
locale-libreoffice-ckb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

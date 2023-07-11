SUMMARY = "Japanese localization files for LibreOffice"
DESCRIPTION = "Provides Japanese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ja-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "a9bdbba1682770c59f8b343d5d93ec62e99037fed4d1fcbae04f23c5235c7bfbc3428fc290522f3085b20ffe61270e91066501c97850a4941221d555f0475857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ja \
libreoffice-l10n-ja \
locale-libreoffice-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Greek localization files for LibreOffice"
DESCRIPTION = "Provides Greek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-el-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "521b78b2e12a27e8dd727f42885e20c226560764149dc50bf064e7e08e804a1e4b113f88d5f7c25e2099f2fbd1dd62e4fbc490568583a9ae3bc2a1f81eb1523b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-el \
libreoffice-l10n-el \
locale-libreoffice-el"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-el-GR"

inherit rpm

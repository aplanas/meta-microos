SUMMARY = "Traditional_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Traditional_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-zh_TW-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "70227437c7e42f3b6db4ef9ad9369c33df74f696738453181dc55c302b60e6fc1bd1670aa971df97ab6333d236580407c4405eb5af24c10fda8d3472075b30a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-Hant \
libreoffice-help-zh-TW \
libreoffice-l10n-zh-Hant \
libreoffice-l10n-zh-TW \
locale-libreoffice-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

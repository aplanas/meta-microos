SUMMARY = "Simplified_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Simplified_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-zh_CN-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "235bf0d2daa9733153b4b5f6e606c3c723792ff90221d903d4202aa3b39a2c4576b5786303eb770ef09d3c895d41df8987b0b4b3280c3521c12ec3ac9a828b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-CN \
libreoffice-help-zh-Hans \
libreoffice-l10n-zh-CN \
libreoffice-l10n-zh-Hans \
locale-libreoffice-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

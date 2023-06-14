SUMMARY = "Simplified_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Simplified_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-zh_CN-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "2fbeffe0b437968386aba0b6e31e943e95f535fe02e91f177a285058de019c38b98bb83b53ab2846fe167a685511e1099f7bda54e074d44f7135ea78afde42ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-CN \
libreoffice-help-zh-Hans \
libreoffice-l10n-zh-CN \
libreoffice-l10n-zh-Hans \
locale-libreoffice-zh-CN"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

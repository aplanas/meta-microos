SUMMARY = "Simplified_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Simplified_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-zh_CN-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "cd202467d96fb8e5d74621a3ffea01547c3eaf0e397b92f9bad36aad32c94ecbf4be22b4bb2fc6450227a2a64683dd7c85aed7c8b5cebfa8a141d7cdfc9231b8"
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

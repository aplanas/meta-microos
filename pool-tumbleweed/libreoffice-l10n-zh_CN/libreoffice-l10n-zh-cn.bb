SUMMARY = "Simplified_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Simplified_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-zh_CN-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "b9eeb267556f8f557faf689e74f17060a833a40f1b5e58dee8fce2eb560754a9e2c05694fd0f0c8fbd068c3ecfb654c259ecb8377df1b2be819152c08a7f443f"
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

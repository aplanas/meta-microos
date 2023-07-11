SUMMARY = "Sindhi localization files for LibreOffice"
DESCRIPTION = "Provides Sindhi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sd-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "2d13ecf60ba87e154e178afb55b5736664b5046097b3866c6c7becb44b7e6e99a496a1c83ba7e1413ac259ede16128e5c2a5d72dd333114226bf8e8c351023f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sd \
libreoffice-l10n-sd \
locale-libreoffice-sd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

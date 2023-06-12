SUMMARY = "Kannada localization files for LibreOffice"
DESCRIPTION = "Provides Kannada translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-kn-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "1377868e8c877f7105b07ed2e75da2f55f95456f030c6fab9e4469ad595e30ad0e151aceb0eef803568681dfee6780a3c407fb2e8a4c6cbb835db2a53a5728de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kn \
libreoffice-l10n-kn \
locale(libreoffice:kn)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

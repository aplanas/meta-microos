SUMMARY = "Kannada localization files for LibreOffice"
DESCRIPTION = "Provides Kannada translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-kn-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "f2d8c57de9d2e10473337d40fc9c64fad8e6836116baa058335b56cf2ca17eb6380b4a21f96f5e1d22889186348e4c5075a2c58e6901024fa78ae0136aa1267b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kn \
libreoffice-l10n-kn \
locale-libreoffice-kn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

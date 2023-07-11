SUMMARY = "Bodo localization files for LibreOffice"
DESCRIPTION = "Provides Bodo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-brx-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "dbda668cd6f29a5bc27fcd337174d62ecd4a840f539b3d37cda1b663fc4e0096d48ab6eabdd07b3ef795e35e855c336bd96a4795dbd43031d8c12c3f3e584914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-brx \
libreoffice-l10n-brx \
locale-libreoffice-brx"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Punjabi localization files for LibreOffice"
DESCRIPTION = "Provides Punjabi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-pa-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "be5e327ee84e8bdc240d60e04b2fd205a8504ebd3592782c895fdc67972f7dc592c9956e226bfb8ad1ce8ddd7cbfbd2e0c6b7a4ee87f5e30d12e5fd38548bb0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pa \
libreoffice-help-pa-IN \
libreoffice-l10n-pa \
libreoffice-l10n-pa-IN \
locale-libreoffice-pa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

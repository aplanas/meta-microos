SUMMARY = "Monglolian localization files for LibreOffice"
DESCRIPTION = "Provides Monglolian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-mn-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "facc38ca3e22e11d393e1d5cc848f78cd603740fa2a8bd905caabd097e75a349eb1d280f3b3c8684d92bcab5bcc237f7f44a9e22ebe71fd518dc85094010bb97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mn \
libreoffice-l10n-mn \
locale-libreoffice-mn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

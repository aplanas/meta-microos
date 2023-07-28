SUMMARY = "Kannada localization files for LibreOffice"
DESCRIPTION = "Provides Kannada translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kn-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "6521a3e9a6fe1c60fc1b3464db763cc3f0c62af86efd18a6f2837cc339c9592a5791a15a37b2a5ffb14d375e4c2e49661210f7b538a9f5bb1cac146fe7ebf20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kn \
libreoffice-l10n-kn \
locale-libreoffice-kn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Kinyarwanda localization files for LibreOffice"
DESCRIPTION = "Provides Kinyarwanda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-rw-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "7b63072575cdae545a20f73f1fa15dbd83bd760d7738e20ae5afc996b8f8f4f4482f70e8de7ec673f2a7d2f5b5e6fa4cf2e6a75ac9aacf3927100a565af99d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-rw \
libreoffice-l10n-rw \
locale-libreoffice-rw"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

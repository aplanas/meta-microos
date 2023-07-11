SUMMARY = "Tatar localization files for LibreOffice"
DESCRIPTION = "Provides Tatar translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tt-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "6a03c96e651c1c945c79bfd43020f4616024e6f5d0f29839645db2cd54de1c03f14420d49519bacbb0b1eaa32fa195c2369edc9e6d7f36c83b596bcd3637fb86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tt \
libreoffice-l10n-tt \
locale-libreoffice-tt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

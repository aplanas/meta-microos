SUMMARY = "English_ZA localization files for LibreOffice"
DESCRIPTION = "Provides English_ZA translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-en_ZA-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "904301b78f9c3bf2df6f97a123ba8750f74c2a73b19dda11ecaf6ec45ae5f985dee643526a90d224b1299813a589c8bc1eee3fe472ad78bc82e2a1d2238487d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-ZA \
libreoffice-l10n-en-ZA \
locale-libreoffice-en-ZA"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-ZA"

inherit rpm

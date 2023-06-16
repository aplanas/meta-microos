SUMMARY = "Thai localization files for LibreOffice"
DESCRIPTION = "Provides Thai translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-th-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "a43fb5d1ddd6452d1480b62729943c781c5456b0060a0533e5ea6eebfdb8c5078ef4e5f566d15f92281ccae8e769aceb5e6c2cb90683ae996c3ca6aa01aa2234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-th \
libreoffice-l10n-th \
locale-libreoffice-th"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-th-TH"

inherit rpm

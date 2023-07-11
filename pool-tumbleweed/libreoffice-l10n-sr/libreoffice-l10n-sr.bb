SUMMARY = "Serbian localization files for LibreOffice"
DESCRIPTION = "Provides Serbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sr-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "63b213a43c5bffc479d8de3d171e117727dce8120616d9ba3a06c13416eea334fdd3e836de5a97924a3cae05243b9942330ec0bca50da76deb2e2b8b4e2a5f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sr \
libreoffice-l10n-sr \
locale-libreoffice-sr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sr"

inherit rpm

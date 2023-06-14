SUMMARY = "Kinyarwanda localization files for LibreOffice"
DESCRIPTION = "Provides Kinyarwanda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-rw-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "ada1b6a8d4308314275239092cb37acb7d395eaf6578416e3d1219089b1b4256b8e10b06ad56e7c4b22f113598376f13fae5fe5acb6394ea21ae3d0c438f9534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-rw \
libreoffice-l10n-rw \
locale-libreoffice-rw"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

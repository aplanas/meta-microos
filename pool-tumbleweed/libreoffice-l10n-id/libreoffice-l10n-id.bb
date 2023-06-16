SUMMARY = "Indonesian localization files for LibreOffice"
DESCRIPTION = "Provides Indonesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-id-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f5fcc534589932dda29658feecc429ab00b42fdd3894083cf5bbc9ccccfb1194c9a3d077d664112f0c2c5231f39cede42934b87e223c49b3abc91d00742002de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-id \
libreoffice-l10n-id \
locale-libreoffice-id"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-id"

inherit rpm

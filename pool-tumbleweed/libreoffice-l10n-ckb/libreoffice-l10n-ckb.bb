SUMMARY = "Central_Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Central_Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ckb-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "077601a6a02f5bdf8c7fd048d3f67e0e53d1bf7c15c8adf5bd6f1ca2ed82db3541ae00220d1ddb44ab324bb5ae1bfcf61969ffe49d5a9fec0b8c48ebbc679c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ckb \
libreoffice-l10n-ckb \
locale-libreoffice-ckb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

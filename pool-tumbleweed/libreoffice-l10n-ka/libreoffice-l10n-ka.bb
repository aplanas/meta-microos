SUMMARY = "Georgian localization files for LibreOffice"
DESCRIPTION = "Provides Georgian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ka-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "a862823accc03fdb5e2d2ecc4b53be5cd5cb87b72aea3b195a21f8b8af4ab71fced4866333531489df096094d96ad48a048ce5d1da6eb99dc99f997f0bd5d3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ka \
libreoffice-l10n-ka \
locale-libreoffice-ka"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

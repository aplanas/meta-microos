SUMMARY = "Monglolian localization files for LibreOffice"
DESCRIPTION = "Provides Monglolian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mn-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "1ecd9883a8ddaa33006b267ec0edd67fd118c32c750afd27fa75bf7f4a03e4cb1601d5c9c141bba728aaf340e2ba2dcd921587084e45314e262898aa45ff1c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mn \
libreoffice-l10n-mn \
locale-libreoffice-mn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

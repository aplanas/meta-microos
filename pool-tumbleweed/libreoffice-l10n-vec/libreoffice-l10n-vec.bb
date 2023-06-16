SUMMARY = "Venetian localization files for LibreOffice"
DESCRIPTION = "Provides Venetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-vec-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "6d2ce8873281f9d608728b4e5c03969ec2a7ead51304193ce5c39d3cf3a3754a693964a2cd186c0cbc0d92bab9f0176c9d35ed8671ff43d66fad107706801b9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vec \
libreoffice-l10n-vec \
locale-libreoffice-vec"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

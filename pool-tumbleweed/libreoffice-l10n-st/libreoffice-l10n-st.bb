SUMMARY = "Southern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-st-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "daaf18a42e471eb4a5b27545ee069bd42945d79b3e966de04cafd9aea6fe458aa7c19a40941db7eb7cbe01cf1f6cd61c0a03165a6b76c7199c2f8b94caf68b28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-st \
libreoffice-l10n-st \
locale-libreoffice-st"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Sidamo localization files for LibreOffice"
DESCRIPTION = "Provides Sidamo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sid-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "d0b67e73897fa0ca62ad9426efe7d3c0ea3352dc5f463046c622a4a5f209fe73b36907a1b92c32c94733049c3c88e49c316683f6710ea5a6dc2407bddc0ca41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sid \
libreoffice-l10n-sid \
locale-libreoffice-sid"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

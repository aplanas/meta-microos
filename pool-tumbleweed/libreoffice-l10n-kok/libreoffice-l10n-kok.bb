SUMMARY = "Konkani localization files for LibreOffice"
DESCRIPTION = "Provides Konkani translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-kok-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "6e185596d30d6fd7b8bccdedd37f2c83ec11763dab55fe8bb7d9e47d8af9d5440bd1dda9008de30883ac79f4cf17cf47e642346bf64444096929877ace48f62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kok \
libreoffice-l10n-kok \
locale-libreoffice-kok"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

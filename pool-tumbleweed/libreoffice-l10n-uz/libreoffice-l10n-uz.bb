SUMMARY = "Uzbek localization files for LibreOffice"
DESCRIPTION = "Provides Uzbek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-uz-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "da859e69a84bf699ef8a39dce7e1609077c158698e2ff70b97e17c90ff43c4afb7ae06a652329b14b898e162524aeb43d500b64eba8fa9566a5494ae2f82aea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uz \
libreoffice-l10n-uz \
locale-libreoffice-uz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

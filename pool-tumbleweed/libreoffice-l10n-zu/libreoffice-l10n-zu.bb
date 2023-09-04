SUMMARY = "Zulu localization files for LibreOffice"
DESCRIPTION = "Provides Zulu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-zu-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "0a5f169abb4ae41c08070f26a2c8c397b7421fd14a4f40480178ded0d857cd0b0e44d49cc3cdbb19731835868d560c783454f1621930277c4fca79bff45d67b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zu \
libreoffice-l10n-zu \
locale-libreoffice-zu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-zu-ZA"

inherit rpm

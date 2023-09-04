SUMMARY = "Indonesian localization files for LibreOffice"
DESCRIPTION = "Provides Indonesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-id-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "315b467af91b5d8b9166cc05ee545e31b41b355c77379a703698e603cda3ef85432b251d4552dd806aa3539cef41ca19118d8636514cb54ed8ed204e94e9254f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-id \
libreoffice-l10n-id \
locale-libreoffice-id"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-id"

inherit rpm

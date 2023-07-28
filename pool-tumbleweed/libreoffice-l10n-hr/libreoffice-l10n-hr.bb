SUMMARY = "Croatian localization files for LibreOffice"
DESCRIPTION = "Provides Croatian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hr-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "42443e636ec26a997b50594fe40a722ec49a747d3de969e38d7e217e50d3f61f95ffc4fedbb4141754becc94e4772cec3db19e3607f278c4b63f13454f066c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hr \
libreoffice-l10n-hr \
locale-libreoffice-hr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hr-HR"

inherit rpm

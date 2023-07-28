SUMMARY = "Hindi localization files for LibreOffice"
DESCRIPTION = "Provides Hindi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hi-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "1fd5ec2e855b6c0591748caa6cdbab784fa74c5b62eb1a44486cfa063b0a2213e77828f9f207395c1008b92c8b75bea95083cce432325e87fd0c53bb72a96c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hi \
libreoffice-help-hi-IN \
libreoffice-l10n-hi \
libreoffice-l10n-hi-IN \
locale-libreoffice-hi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hi-IN"

inherit rpm

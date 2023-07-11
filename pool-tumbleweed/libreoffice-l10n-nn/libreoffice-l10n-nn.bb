SUMMARY = "Nynorsk localization files for LibreOffice"
DESCRIPTION = "Provides Nynorsk translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nn-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "395eb6517ca7789ffbbc0e9d2146de25aeb5ac5777c7b1b2999475c983c6a076c00f9ed5dc7c3e80d178b7b09a2f4402b42d3853cb43b65248ca76f618a35859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nn \
libreoffice-l10n-nn \
locale-libreoffice-nn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nn-NO"

inherit rpm

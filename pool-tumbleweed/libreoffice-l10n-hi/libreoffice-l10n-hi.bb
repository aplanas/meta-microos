SUMMARY = "Hindi localization files for LibreOffice"
DESCRIPTION = "Provides Hindi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-hi-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "02af44180575a96a954a04f0c38d39bfbdafbde7a0019f9d265de8ce498e8ecd0857ed136fda21720bb1d94ea43c1cb21aee41c541fcbb8b2832efa43c0f1480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hi \
libreoffice-help-hi-IN \
libreoffice-l10n-hi \
libreoffice-l10n-hi-IN \
locale(libreoffice:hi)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hi_IN"

inherit rpm

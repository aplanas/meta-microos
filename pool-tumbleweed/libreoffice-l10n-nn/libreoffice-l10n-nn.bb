SUMMARY = "Nynorsk localization files for LibreOffice"
DESCRIPTION = "Provides Nynorsk translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-nn-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "3e09c0701d9637935abce752afa27c5a67e46fdddd9c9646f78fdf67e3e868b716aaed871f468151b07d4a8e3294c45847e2f0d2ac9c0a7ff1fdbd9efa1b4784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nn \
libreoffice-l10n-nn \
locale-libreoffice-nn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nn-NO"

inherit rpm

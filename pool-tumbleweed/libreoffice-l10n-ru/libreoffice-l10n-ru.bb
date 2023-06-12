SUMMARY = "Russian localization files for LibreOffice"
DESCRIPTION = "Provides Russian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ru-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "dd36b2eb8958edfe797dc884d79d2be66c88414fd2b262d35c82cde1beada6131ea04603038d34adbce13794012beee9af7b0d61579b0739df57c1b9dc96edfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ru \
libreoffice-l10n-ru \
locale(libreoffice:ru)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ru_RU"

inherit rpm

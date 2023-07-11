SUMMARY = "Swahili localization files for LibreOffice"
DESCRIPTION = "Provides Swahili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sw_TZ-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "10bc92932309b2bfa047330f9eba7fc36300ed7e7d3a9cff7de12fb5b60df75019318d99bc18c3935db10e815459ba6346821cc67cce0722d8bbf5cd82233790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sw-TZ \
libreoffice-l10n-sw-TZ \
locale-libreoffice-sw-TZ"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sw-TZ"

inherit rpm

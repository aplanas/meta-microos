SUMMARY = "Albanian localization files for LibreOffice"
DESCRIPTION = "Provides Albanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sq-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "1a8e3e370f8912bbb1c603e3f98756872ad8afcba9b4400b3f42c420f5e5b9097622cf77a4d1164aa67dc5f2cb5a0a8696da7c2eced8380348d5bae1cbba0a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sq \
libreoffice-l10n-sq \
locale-libreoffice-sq"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sq-AL"

inherit rpm

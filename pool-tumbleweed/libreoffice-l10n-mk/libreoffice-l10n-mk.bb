SUMMARY = "Macedonian localization files for LibreOffice"
DESCRIPTION = "Provides Macedonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mk-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "8b99c894ab2efa57a1ffd16fcc39f714df694b991bb4601301e83251cffc5b527b040d422085ebf7716a0ddeb86b1c68bc535417e1d18dba802f7ce4ff4b78ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mk \
libreoffice-l10n-mk \
locale-libreoffice-mk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

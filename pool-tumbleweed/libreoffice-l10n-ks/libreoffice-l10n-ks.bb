SUMMARY = "Kashmiri localization files for LibreOffice"
DESCRIPTION = "Provides Kashmiri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ks-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "290cf56395e73cb848bdb524244d4862af5b225b36debfaa18baf3ee3c3e199d930a5237153afe3944574b2db173b6aad300d4d95c851f3678156a12c9b76e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ks \
libreoffice-l10n-ks \
locale-libreoffice-ks"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

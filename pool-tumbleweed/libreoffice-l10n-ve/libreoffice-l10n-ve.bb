SUMMARY = "Venda localization files for LibreOffice"
DESCRIPTION = "Provides Venda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ve-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "cc6fa2407a5f0af024235ad1ef6d3d91d3ed9da8a10dc5b9e84490b7f102d0374fc21a76770893d59239d8fcef6b34973ed6866438356dd2e00659769394a4e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ve \
libreoffice-l10n-ve \
locale-libreoffice-ve"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

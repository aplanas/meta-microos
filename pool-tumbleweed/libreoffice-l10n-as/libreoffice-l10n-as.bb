SUMMARY = "Assamese localization files for LibreOffice"
DESCRIPTION = "Provides Assamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-as-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "e9db141a131274634fa6daf0f3c2a1f7355b2bf49ab3d44152caa2539735709adc5ba2b14c4f4a1eead8344313f26589f8c891e39b9956e36b0d7b545229ac0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-as \
libreoffice-l10n-as \
locale-libreoffice-as"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
